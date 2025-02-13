package com.richardsherrill.website.model.weather;

/**
 * Model class for the current weather
 */
public class CurrentWeather {

    private String city;
    private String state;
    private String country;
    private String timezone;
    private String tempF;
    private String tempC;
    private String condition;
    private String feelsLikeF;
    private String feelsLikeC;


    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }

    public String getTempF() {
        return tempF;
    }

    public void setTempF(final String tempF) {
        this.tempF = tempF;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(final String tempC) {
        this.tempC = tempC;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    public String getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(final String feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public String getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(final String feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", timezone='" + timezone + '\'' +
                ", tempF='" + tempF + '\'' +
                ", tempC='" + tempC + '\'' +
                ", condition='" + condition + '\'' +
                ", feelsLikeF='" + feelsLikeF + '\'' +
                ", feelsLikeC='" + feelsLikeC + '\'' +
                '}';
    }
}
