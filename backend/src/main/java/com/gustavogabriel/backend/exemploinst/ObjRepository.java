package com.gustavogabriel.backend.exemploinst;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class ObjRepository {
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName());
	}

}
