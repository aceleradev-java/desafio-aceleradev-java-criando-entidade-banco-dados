package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Embeddable
@EqualsAndHashCode
@ToString
public class SubmissionIdentity implements Serializable {

    @ManyToOne
    private User user;
    
    @ManyToOne
    private Challenge challenge;

    public SubmissionIdentity() {
    }

    public SubmissionIdentity(User user, Challenge challenge) {
        this.user = user;
        this.challenge = challenge;
    }

}
