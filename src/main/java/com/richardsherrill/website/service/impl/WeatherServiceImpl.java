package com.richardsherrill.website.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.richardsherrill.website.model.weather.CurrentWeather;
import com.richardsherrill.website.model.weather.Forecast;
import com.richardsherrill.website.model.weather.ForecastDay;
import com.richardsherrill.website.service.WeatherService;
import com.richardsherrill.website.utils.CurrentWeatherDeserializer;
import com.richardsherrill.website.utils.ForecastDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Service
public class WeatherServiceImpl implements WeatherService {
    @Value("${weatherapi.key}")
    private String key;

    /*@Value("classpath:forecast.json")
    Resource forecastResource;
    @Value("classpath:current_weather.json")
    Resource currentWeatherResource;
    private String testJson;*/
    @Autowired
    @Qualifier("weatherClient")
    private WebClient webClient;

    @Override
    public CurrentWeather retrieveCurrentWeather(String query) {
        System.out.println("Retrieving Current Weather");
        final String response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                .path("/current.json")
                .queryParam("key", key)
                .queryParam("q", query)
                .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        try {
            //testJson = ResourceReader.asString(currentWeatherResource); // **TESTING ONLY**
            final ObjectMapper mapper = new ObjectMapper();
            final SimpleModule simpleModule = new SimpleModule();
            simpleModule.addDeserializer(CurrentWeather.class, new CurrentWeatherDeserializer());
            mapper.registerModule(simpleModule);

            final CurrentWeather currentWeather = mapper.readValue(response, CurrentWeather.class);
            System.out.println("Current Weather json successfully read");
            return currentWeather;
        } catch (JsonProcessingException e) {
            System.out.println("Could not process json for CurrentWeather object");
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ForecastDay> retrieveForecast(String query, int days) {
        System.out.println("Retrieving Forecast");
        final String response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/forecast.json")
                        .queryParam("key", key)
                        .queryParam("q", query)
                        .queryParam("days", days)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        try {
            //testJson = ResourceReader.asString(forecastResource); // **TESTING ONLY**
            final ObjectMapper mapper = new ObjectMapper();
            final SimpleModule simpleModule = new SimpleModule();
            simpleModule.addDeserializer(Forecast.class, new ForecastDeserializer());
            mapper.registerModule(simpleModule);

            final Forecast forecast = mapper.readValue(response, Forecast.class);
            System.out.println("Forecast json successfully read");
            return forecast.getForecastDayList();
        } catch (JsonProcessingException e) {
            System.out.println("Could not process json for Forecast object");
            throw new RuntimeException(e);
        }
    }
}
