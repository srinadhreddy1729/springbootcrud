package com.example.profiles.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.profiles.DTO.DTOClass;
import com.example.profiles.Entity.School;
import com.example.profiles.service.ServiceLayerImpl;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@RestController
@Validated
@ResponseBody
public class ControllerLayer {
	@Autowired
	private ServiceLayerImpl serlayer;
	public ServiceLayerImpl getSerlayer() {
		return serlayer;
	}
	public void setSerlayer(ServiceLayerImpl serlayer) {
		this.serlayer = serlayer;
	}
	@GetMapping("/get")
	public List<School> gettingTheAllData()
	{
		
		return serlayer.gettingAllDeatils();
	}
	@PostMapping("/post")
	public ResponseEntity<DTOClass>savingAllTheValues(@Valid @RequestBody DTOClass school)
	{
		return new ResponseEntity<DTOClass>(serlayer.savingIntoDataBase(school),HttpStatus.CREATED);
		
		
	}
  
}
