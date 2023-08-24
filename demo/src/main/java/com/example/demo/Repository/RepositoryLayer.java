package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Phone;
import java.util.List;



public interface RepositoryLayer extends JpaRepository<Phone, Integer> {
	@Query(value="select * from Phone where id=?1",nativeQuery=true)
	public Phone findbyPhoneNumber(Integer Number);

	
                                     
}
