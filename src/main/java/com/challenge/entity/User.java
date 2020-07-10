package com.challenge.entity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
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
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "submission",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "challenge_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<Challenge> submissions = new HashSet<>();

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
//
//    public Set<Challenge> getChallenges() {
//        return challenges;
//    }
//
//    public void setChallenges(Set<Challenge> challenges) {
//        this.challenges = challenges;
//    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public Set<Challenge> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Set<Challenge> submissions) {
        this.submissions = submissions;
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
