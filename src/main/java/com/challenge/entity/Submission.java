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
public class Submission implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SubmissionIdentity id;
    
    @Column
    private Float score;
    
    @Column
    private Timestamp createdAt;
    
    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne
    @MapsId("challenge_id")
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    public Submission() {
    }

    public Submission(SubmissionIdentity id, Float score, Timestamp createdAt) {
        this.id = id;
        this.score = score;
        this.createdAt = createdAt;
    }

    public SubmissionIdentity getId() {
        return id;
    }

    public void setId(SubmissionIdentity id) {
        this.id = id;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
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

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }
    
}
