package com.richardsherrill.website.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long jobId;
    private String companyName;
    private String companyCity;
    private String companyState;
    private String title;
    private Date dateStarted;
    private Date dateEnded;
    private String description;
    private String technology;
    @ManyToOne(fetch = FetchType.LAZY)
    private Resume resume;

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(final Long jobId) {
        this.jobId = jobId;
    }

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


    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", companyName='" + companyName + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyState='" + companyState + '\'' +
                ", title='" + title + '\'' +
                ", dateStarted=" + dateStarted +
                ", dateEnded=" + dateEnded +
                ", description='" + description + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}
