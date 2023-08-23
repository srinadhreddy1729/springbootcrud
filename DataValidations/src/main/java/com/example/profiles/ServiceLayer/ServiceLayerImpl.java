package com.example.profiles.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profiles.DTOLayer.StudentDTO;
import com.example.profiles.Entity.StudentDetails;
import com.example.profiles.RepositoryLayer.RepositoryLayer;

@Service
public class ServiceLayerImpl implements ServiceLayerInter {
     @Autowired
	private RepositoryLayer RLayer;
	public StudentDTO SavingAllTheDetails(StudentDTO layer) {
	  StudentDetails jj=new StudentDetails();
	  jj.setId(layer.getId());
	  jj.setStudentaadharnumber(layer.getStudentaadharnumber());
	  jj.setStudentcollegename(layer.getStudentcollegename());
	  jj.setStudentemailid(layer.getStudentemailid());
	  jj.setStudentfathername(layer.getStudentfathername());
	  jj.setStudentidnumber(layer.getStudentidnumber());
	  jj.setStudentmarks(layer.getStudentmarks());
	  jj.setStudentmobilenumber(layer.getStudentmobilenumber());
	  jj.setStudentname(layer.getStudentname());
	  jj.setStudentpancard(layer.getStudentpancard());
	  RLayer.save(jj);
	  return layer;
	}
	public RepositoryLayer getRLayer() {
		return RLayer;
	}
	public void setRLayer(RepositoryLayer layer) {
		RLayer = layer;
	}
	

}
