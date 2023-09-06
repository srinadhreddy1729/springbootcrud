package com.example.profiles.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.profiles.DTOLayer.StudentDTO;
import com.example.profiles.ServiceLayer.ServiceLayerImpl;

import jakarta.validation.Valid;

@RestController
@ResponseBody
@Validated
@RequestMapping("srinadh")
public class ControllerLayerImpl {
	@Autowired
	private ServiceLayerImpl slayer;

	public ServiceLayerImpl getSlayer() {
		return slayer;
	}

	public void setSlayer(ServiceLayerImpl slayer) {
		this.slayer = slayer;
	}
	@PostMapping("/post")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<StudentDTO> savingAllDeatils(@Valid @RequestBody StudentDTO Dlayer)
	{
		return new ResponseEntity<StudentDTO>(slayer.SavingAllTheDetails(Dlayer),HttpStatus.CREATED);
	}

}
