package com.challenge.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CandidateIdentity id;
    
    @Column
    private int status;
    
    @Column
    private Timestamp createdAt;

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

    @Override
    public String toString() {
        return "Candidate [id=" + id + ", status=" + status + ", createdAt=" + createdAt + "]";
    }

}
