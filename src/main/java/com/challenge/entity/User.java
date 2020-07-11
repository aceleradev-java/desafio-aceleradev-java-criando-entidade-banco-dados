package com.challenge.entity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(length = 100)
    private String fullName;
    
    @Column(length = 100)
    private String email;
    
    @Column(length = 50)
    private String nickname;
    
    @Column(length = 255)
    private String password;
    
    @Column
    private Timestamp createdAt;
    
    @OneToMany(mappedBy = "user")
    private Set<Submission> submissions;
    
    @OneToMany(mappedBy = "user")
    private Set<Candidate> candidates ;
    
    public User() {
    }

    public User(String fullName, String email, String nickname, String password, Timestamp createdAt) {
        this.fullName = fullName;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    
    public Set<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Set<Submission> submissions) {
        this.submissions = submissions;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", nickname=" + nickname
                + ", password=" + password + ", createdAt=" + createdAt + "]";
    }
    
}
