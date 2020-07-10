package com.challenge.entity;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
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
    
}
