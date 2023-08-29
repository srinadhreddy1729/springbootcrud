package com.example.profiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.Entity.TV;

public interface RepositoryLayer extends JpaRepository<TV, Integer> {

}
