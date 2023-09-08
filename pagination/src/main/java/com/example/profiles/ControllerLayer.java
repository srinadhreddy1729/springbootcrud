package com.example.profiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {
	  @Autowired
	private ServiceLayer layer;
 public ServiceLayer getLayer() {
		return layer;
	}
	public void setLayer(ServiceLayer layer) {
		this.layer = layer;
	}
	@GetMapping("/get")
public List<Alien> gacobo()
 {
	 return layer.getting();
 }
}
