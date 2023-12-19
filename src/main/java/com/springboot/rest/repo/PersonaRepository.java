package com.springboot.rest.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.rest.modelo.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {



}