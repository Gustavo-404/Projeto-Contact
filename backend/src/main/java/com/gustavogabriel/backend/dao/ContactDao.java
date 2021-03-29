package com.gustavogabriel.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavogabriel.backend.entidade.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Integer>{

}
