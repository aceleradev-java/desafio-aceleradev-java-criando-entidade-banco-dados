package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"acceleration", "company", "user"})
public class CandidateIdentity  implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Acceleration acceleration;

    @ManyToOne
    private Company company;

    public CandidateIdentity() {
    }

    public CandidateIdentity(User user, Acceleration acceleration, Company company) {
        this.user = user;
        this.acceleration = acceleration;
        this.company = company;
    }

}
