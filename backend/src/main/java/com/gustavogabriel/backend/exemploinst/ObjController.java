package com.gustavogabriel.backend.exemploinst;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

@Controller
public class ObjController {
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName());
	}

}
