package com.richardsherrill.website.model.weather;

import java.util.List;

/**
 * Model class for the forecast
 */
public class Forecast {
    public static final int DAYS = 7;

    private List<ForecastDay> forecastDayList;

    public Forecast(final List<ForecastDay> forecastDayList) {
        this.forecastDayList = forecastDayList;
    }

    public List<ForecastDay> getForecastDayList() {
        return forecastDayList;
    }

    public void setForecastDayList(final List<ForecastDay> forecastDayList) {
        this.forecastDayList = forecastDayList;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastDayList=" + forecastDayList +
                '}';
    }
}
