package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class SubmissionIdentity implements Serializable {

    private static final long serialVersionUID = 1L;
    
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((challenge == null) ? 0 : challenge.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
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
        if (challenge == null) {
            if (other.challenge != null)
                return false;
        } else if (!challenge.equals(other.challenge))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }
    
}
