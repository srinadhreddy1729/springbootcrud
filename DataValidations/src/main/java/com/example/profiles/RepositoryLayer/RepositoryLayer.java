package com.example.profiles.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.Entity.StudentDetails;

public interface RepositoryLayer extends JpaRepository<StudentDetails, Integer> {

}
