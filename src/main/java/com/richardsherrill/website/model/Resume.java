package com.richardsherrill.website.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Education education;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private List<Job>  jobList;

    public Education getEducation() {
        return education;
    }

    public void setEducation(final Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", education=" + education +
                ", jobList=" + jobList +
                '}';
    }
}
