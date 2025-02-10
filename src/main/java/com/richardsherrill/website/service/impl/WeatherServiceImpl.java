package com.richardsherrill.website.service.impl;

import com.richardsherrill.website.model.Weather;
import com.richardsherrill.website.service.WeatherService;
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

    @Autowired
    @Qualifier("weatherClient")
    private WebClient webClient;
    @Override
    public Weather retrieveCurrentWeather(String query) {
        String response = webClient.get()
                .uri(uriBuilder -> uriBuilder
                .path("/current.json")
                .queryParam("key", key)
                .queryParam("q", query)
                .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
        System.out.println("WeatherAPI response: " + response);
        return null;
    }

    @Override
    public List<Weather> retrieveForecast(String query, int days) {
        return null;
    }
}
