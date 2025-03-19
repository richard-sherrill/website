package com.richardsherrill.website.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;
    @OneToOne(fetch = FetchType.LAZY)
    private Education education;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resume")
    private List<Job>  jobList;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPersonId(final Person person) {
        this.person = person;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(final Education education) {
        this.education = education;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(final List<Job> jobList) {
        this.jobList = jobList;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", person=" + person +
                ", education=" + education +
                ", jobList=" + jobList +
                '}';
    }
}
