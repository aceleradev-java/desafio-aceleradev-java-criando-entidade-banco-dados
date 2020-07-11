package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CandidateIdentity  implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name="user_id")
    private Integer userId;
    
    @Column(name="acceleration_id")
    private Integer accelerationId;
    
    @Column(name="company_id")
    private Integer companyId;

    public CandidateIdentity() {
    }

    public CandidateIdentity(Integer userId, Integer accelerationId, Integer companyId) {
        this.userId = userId;
        this.accelerationId = accelerationId;
        this.companyId = companyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccelerationId() {
        return accelerationId;
    }

    public void setAccelerationId(Integer accelerationId) {
        this.accelerationId = accelerationId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accelerationId == null) ? 0 : accelerationId.hashCode());
        result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
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
        CandidateIdentity other = (CandidateIdentity) obj;
        if (accelerationId == null) {
            if (other.accelerationId != null)
                return false;
        } else if (!accelerationId.equals(other.accelerationId))
            return false;
        if (companyId == null) {
            if (other.companyId != null)
                return false;
        } else if (!companyId.equals(other.companyId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CandidateIdentity [userId=" + userId + ", accelerationId=" + accelerationId + ", companyId=" + companyId
                + "]";
    }
    
}
