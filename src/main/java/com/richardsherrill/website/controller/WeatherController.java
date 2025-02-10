package com.richardsherrill.website.controller;

import com.richardsherrill.website.model.Weather;
import com.richardsherrill.website.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/current")
    public Weather getCurrentWeather(@RequestParam String query) {
        return weatherService.retrieveCurrentWeather(query);
    }


}
