package com.example.profiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profiles.DTO.DTOClass;
import com.example.profiles.Entity.School;
import com.example.profiles.repository.Reposity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Service
public class ServiceLayerImpl {
	@Autowired
	private Reposity repo;
	public Reposity getRepo() {
		return repo;
	}
	public void setRepo(Reposity repo) {
		this.repo = repo;
	}
	public List<School>gettingAllDeatils()
	{
		return repo.findAll();
	}
	public School savingAllDetails(School s)
	{
		return repo.save(s);
	}
	public DTOClass savingIntoDataBase(DTOClass Dclass)
	{
		School jj=new School();
		jj.setEmployeeEmail(Dclass.getEmployeeEmail());
		jj.setEmployeeName(Dclass.getEmployeeName());
		jj.setEmployeePanCardNumber(Dclass.getEmployeePanCardNumber());
		jj.setEmployeeSalary(Dclass.getEmployeeSalary());
		jj.setId(Dclass.getId());
		repo.save(jj);
		return Dclass;
	}

}
