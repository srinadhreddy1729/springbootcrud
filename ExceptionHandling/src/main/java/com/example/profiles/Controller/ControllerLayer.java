package com.example.profiles.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.profiles.DTO.classDTO;
import com.example.profiles.Entity.TV;
import com.example.profiles.ExceptionLay.IAM_NOT_HUMAN_EXCEPTION;
import com.example.profiles.Service.ServiceLayer;

@RestController
public class ControllerLayer {
	@Autowired
	private ServiceLayer lay;

	@GetMapping("/roman/{id}")
	public ResponseEntity<classDTO> getsingledata(@PathVariable("id") int i ) throws IAM_NOT_HUMAN_EXCEPTION
	{
		return new ResponseEntity<classDTO>(lay.getsinglevalue(i),HttpStatus.ACCEPTED);
	}
	
	
	
	public ServiceLayer getLay() {
		return lay;
	}

	public void setLay(ServiceLayer lay) {
		this.lay = lay;
	}

}
