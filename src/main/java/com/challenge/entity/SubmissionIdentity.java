package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SubmissionIdentity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name="user_id")
    private Integer userId;
    
    @Column(name="challenge_id")
    private Integer challengeId;
    

    public SubmissionIdentity(Integer userId, Integer challengeid) {
        this.userId = userId;
        this.challengeId = challengeid;
    }

    public SubmissionIdentity() {
    }

    public Integer getUser() {
        return userId;
    }

    public void setUser(Integer userId) {
        this.userId = userId;
    }

    public Integer getChallenge() {
        return challengeId;
    }

    public void setChallenge(Integer challengeId) {
        this.challengeId = challengeId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((challengeId == null) ? 0 : challengeId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SubmissionIdentity other = (SubmissionIdentity) obj;
        if (challengeId == null) {
            if (other.challengeId != null)
                return false;
        } else if (!challengeId.equals(other.challengeId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
    }

}
