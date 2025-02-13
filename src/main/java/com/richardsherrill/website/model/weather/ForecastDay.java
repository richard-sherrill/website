package com.richardsherrill.website.model.weather;

/**
 * Model class for a forecast day
 */
public class ForecastDay {


    private String date;
    private String highF;
    private String highC;
    private String lowF;
    private String lowC;
    private String condition;

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public String getHighF() {
        return highF;
    }

    public void setHighF(final String highF) {
        this.highF = highF;
    }

    public String getHighC() {
        return highC;
    }

    public void setHighC(final String highC) {
        this.highC = highC;
    }

    public String getLowF() {
        return lowF;
    }

    public void setLowF(final String lowF) {
        this.lowF = lowF;
    }

    public String getLowC() {
        return lowC;
    }

    public void setLowC(final String lowC) {
        this.lowC = lowC;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(final String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "date='" + date + '\'' +
                ", highF='" + highF + '\'' +
                ", highC='" + highC + '\'' +
                ", lowF='" + lowF + '\'' +
                ", lowC='" + lowC + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
