package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.Entity.School;

public interface Reposity extends JpaRepository<School, Integer> {

}
