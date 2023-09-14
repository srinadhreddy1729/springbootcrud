package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {
	@Autowired
	private CollegeRepository layer;

	public CollegeRepository getLayer() {
		return layer;
	}

	public void setLayer(CollegeRepository layer) {
		this.layer = layer;
	}
	@GetMapping("/add")
	public List<College> hello(@RequestBody College col)
	{
		return layer.findAll();
	}
}
