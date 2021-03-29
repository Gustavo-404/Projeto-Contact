package com.gustavogabriel.backend.exemploinst;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ObjService {
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName());
	}

}
