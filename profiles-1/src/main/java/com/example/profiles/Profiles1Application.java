package com.example.profiles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.profiles.Entity.School;
import com.example.profiles.repository.Reposity;
import com.example.profiles.service.ServiceLayerImpl;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SpringBootApplication
public class Profiles1Application //implements CommandLineRunner
{

//	@Autowired
//	private Reposity serlayer;
//	@Autowired
//	private Reopo slayer;
//
//	
//	public Reopo getSlayer() {
//		return slayer;
//	}


//	public void setSlayer(Reopo slayer) {
//		this.slayer = slayer;
//	}


	public static void main(String[] args)  {
		
		SpringApplication.run(Profiles1Application.class, args);
	}

	
//	public Reposity getSerlayer() {
//		return serlayer;
//	}
//
//
//	public void setSerlayer(Reposity serlayer) {
//		this.serlayer = serlayer;
//	}
//

//	public void run(String... args) throws Exception {
//		  School mm=new School();
//		  mm.setId(3);
//		  mm.setSchoolcolor("yank");
//		  mm.setSchoolname("chaia");
//		  mm.setSchoolstrength(789);
//		College jj=new College();
//		  jj.setCollegename("jani");
//		  jj.setCollegeStrength(12l);
//		  jj.setId(3);
//		  List<School> oo=new ArrayList();
//		  oo.add(mm);
//		  oo.add(mm);
//
//		  jj.setSchool(oo);
//		  serlayer.save(mm);
//		  slayer.save(jj);
//		  
		  
		
	}


