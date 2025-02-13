package com.richardsherrill.website.controller;

import com.richardsherrill.website.model.weather.CurrentWeather;
import com.richardsherrill.website.model.weather.Forecast;
import com.richardsherrill.website.model.weather.ForecastDay;
import com.richardsherrill.website.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/current")
    public CurrentWeather getCurrentWeather(@RequestParam String query) {
        return weatherService.retrieveCurrentWeather(query);
    }

    @GetMapping("/forecast")
    public List<ForecastDay> getForecast(@RequestParam String query) {
        return weatherService.retrieveForecast(query, Forecast.DAYS);
    }


}
