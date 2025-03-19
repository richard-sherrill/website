package com.richardsherrill.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long educationId;
    private String university;
    private String degree;
    private Date graduation;

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(final Long educationId) {
        this.educationId = educationId;
    }

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
                "id=" + id +
                ", educationId=" + educationId +
                ", university='" + university + '\'' +
                ", degree='" + degree + '\'' +
                ", graduation=" + graduation +
                '}';
    }
}
