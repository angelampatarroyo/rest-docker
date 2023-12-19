package com.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.modelo.Persona;
import com.springboot.rest.repo.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	private PersonaRepository personaRepository;
	
	@Autowired
	public PersonaServiceImpl(PersonaRepository personaRepository) {
		this.personaRepository=personaRepository;
		
	}

	@Override
	public void crearPersona(Persona persona) {
		personaRepository.save(persona);
		
	}

	@Override
	public List<Persona> obtenerPersonas() {
		return (List<Persona>) personaRepository.findAll();
	}

	@Override
	public void obtenerPersona() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarPersona(Persona persona) {
		personaRepository.save(persona);
	}

	

}
