package com.richardsherrill.website.model;

import java.util.Date;

public class Resume {

    private String companyName;
    private String companyCity;
    private String companyState;
    private String title;
    private Date dateStarted;
    private Date dateEnded;
    private String description;
    private String technology;
    private Education education;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(final String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(final String companyState) {
        this.companyState = companyState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(final Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(final Date dateEnded) {
        this.dateEnded = dateEnded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(final String technology) {
        this.technology = technology;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(final Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "companyName='" + companyName + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyState='" + companyState + '\'' +
                ", title='" + title + '\'' +
                ", dateStarted=" + dateStarted +
                ", dateEnded=" + dateEnded +
                ", description='" + description + '\'' +
                ", technology='" + technology + '\'' +
                ", education=" + education +
                '}';
    }
}
