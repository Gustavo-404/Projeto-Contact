package com.gustavogabriel.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavogabriel.backend.dao.ClienteDao;
import com.gustavogabriel.backend.entidade.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteRest {

	@Autowired
	private ClienteDao clienteDao;
	
	@GetMapping
	public List<Cliente> get(){
		return clienteDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		clienteDao.deleteById(id);
	}
}
