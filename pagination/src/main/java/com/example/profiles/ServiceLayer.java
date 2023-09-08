package com.example.profiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@Service
public class ServiceLayer {
	@Autowired
	private RepositoryLayer layer;
	public List<Alien> getting()
	{		
 Pageable pageable=PageRequest.of(0, 2);
		
		return layer.findByIdOrPage(1, pageable,pageable.getSort()).getContent();
	
	}

	public RepositoryLayer getLayer() {
		return layer;
	}

	public void setLayer(RepositoryLayer layer) {
		this.layer = layer;
	}

}
