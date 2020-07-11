package com.challenge.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CandidateIdentity id;
    
    @Column
    private int status;
    
    @Column
    private Timestamp createdAt;
    
    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne
    @MapsId("company_id")
    @JoinColumn(name = "company_id")
    private Company company;
    
    @ManyToOne
    @MapsId("acceleration_id")
    @JoinColumn(name = "acceleration_id")
    private Acceleration acceleration;

    public Candidate() {
    }

    public Candidate(CandidateIdentity id, int status, Timestamp createdAt) {
        this.id = id;
        this.status = status;
        this.createdAt = createdAt;
    }

    public CandidateIdentity getId() {
        return id;
    }

    public void setId(CandidateIdentity id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Acceleration getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Candidate [id=" + id + ", status=" + status + ", createdAt=" + createdAt + "]";
    }

}
