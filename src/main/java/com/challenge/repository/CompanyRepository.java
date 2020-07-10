package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {}
