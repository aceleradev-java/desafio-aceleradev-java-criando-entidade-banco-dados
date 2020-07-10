package com.challenge.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Challenge {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    @Column
    private Integer id;
    
    @Column(length=100)
    private String name;
    
    @Column(length=50)
    private String slug;
    
    @Column
    private Timestamp createdAt;
    
}
