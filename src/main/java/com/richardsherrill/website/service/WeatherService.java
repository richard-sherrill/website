package com.richardsherrill.website.service;

import com.richardsherrill.website.model.Weather;

import java.util.List;

/**
 * Service class to retrieve weather data from WeatherAPI
 */
public interface WeatherService {

    /**
     * Retrieve the current weather
     * @param query Zip/Post Code, City, or IP Address
     * @return the Weather object
     */
    Weather retrieveCurrentWeather(String query);

    /**
     * Retrieve the N day forecast
     * @param query Zip/Post Code, City, or IP Address
     * @param days the number of forecast days (max 14 days)
     * @return a list of Weather objects
     */
    List<Weather> retrieveForecast(String query, int days);

}
