package com.example.profiles.Service;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profiles.DTO.classDTO;
import com.example.profiles.Entity.TV;
import com.example.profiles.ExceptionLay.IAM_NOT_HUMAN_EXCEPTION;
import com.example.profiles.Repository.RepositoryLayer;

@Service
public class ServiceLayer {
	@Autowired
	private RepositoryLayer layer;

	public RepositoryLayer getLayer() {
		return layer;
	}

	public void setLayer(RepositoryLayer layer) {
		this.layer = layer;
	}
	public classDTO getsinglevalue(int i) throws IAM_NOT_HUMAN_EXCEPTION
	{
		
	 java.util.Optional<TV> mm=layer.findById(i);
	  if(!mm.isPresent())
	  {
		  throw new IAM_NOT_HUMAN_EXCEPTION("yes i am not");
	  }
	  else
	  {
			TV kk=layer.findById(i).get();

	 classDTO gg=new classDTO();
	 gg.setTvcompany(kk.getTvcompany());
	 gg.setTvcost(kk.getTvcost());
	 gg.setTvid(kk.getTvid());
	 gg.setTvname(kk.getTvname());
	 return gg;

	  }
	 
	}

}
