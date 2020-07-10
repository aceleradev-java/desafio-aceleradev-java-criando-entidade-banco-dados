package com.challenge.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    @Column
    private String fullName;
    
    @Column
    private String email;
    
    @Column
    private String nickname;
    
    @Column
    private String password;
    
    @Column
    private Timestamp createdAt;
    
}
