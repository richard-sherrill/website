package com.richardsherrill.website.controller;

import com.richardsherrill.website.model.weather.CurrentWeather;
import com.richardsherrill.website.model.weather.Forecast;
import com.richardsherrill.website.model.weather.ForecastDay;
import com.richardsherrill.website.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for weather related endpoints
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/current")
    public CurrentWeather getCurrentWeather(@RequestParam final String query) {
        return weatherService.retrieveCurrentWeather(query);
    }

    @GetMapping("/forecast")
    public List<ForecastDay> getForecast(@RequestParam final String query) {
        return weatherService.retrieveForecast(query, Forecast.DAYS);
    }

}
