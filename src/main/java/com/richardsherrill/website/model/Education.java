package com.richardsherrill.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

public class Education {

    private String university;
    private String degree;
    private Date graduation;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(final String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(final String degree) {
        this.degree = degree;
    }

    public Date getGraduation() {
        return graduation;
    }

    public void setGraduation(final Date graduation) {
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Education{" +
                "university='" + university + '\'' +
                ", degree='" + degree + '\'' +
                ", graduation=" + graduation +
                '}';
    }
}
