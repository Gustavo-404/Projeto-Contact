package com.gustavogabriel.backend.rest;

import org.springframework.stereotype.Service;

@Service
public class ExemploServico {
	
	private String memoria;

	public void realizarTarefa() {
		System.out.println("tarefa realizada");
	}
	
	public void realizarTarefa(final String param) {
		String _param = param + "ABC";
		
		
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	
	
}
