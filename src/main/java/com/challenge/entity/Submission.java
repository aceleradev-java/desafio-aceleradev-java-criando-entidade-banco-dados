package com.challenge.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Submission implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SubmissionIdentity id;
    
    @Column
    @NotNull
    private Float score;
    
    @Column
    @CreatedDate
    private Timestamp createdAt;
    
    public Submission() {
    }

    public Submission(SubmissionIdentity id, Float score, Timestamp createdAt) {
        this.id = id;
        this.score = score;
        this.createdAt = createdAt;
    }

}
