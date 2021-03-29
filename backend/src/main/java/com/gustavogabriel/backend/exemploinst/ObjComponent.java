package com.gustavogabriel.backend.exemploinst;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjComponent {
	
	@Autowired
	private ObjService service;
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName());
	}

}
