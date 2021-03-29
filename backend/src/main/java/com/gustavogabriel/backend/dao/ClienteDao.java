package com.gustavogabriel.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavogabriel.backend.entidade.Cliente;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
