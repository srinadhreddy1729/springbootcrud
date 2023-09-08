package com.example.profiles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryLayer extends JpaRepository<Alien, Integer>{
	@Query("select e from Alien e where id=?1")
	Page<Alien> findByIdOrPage(int s,Pageable pageable,Sort sort);

}
