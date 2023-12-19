package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.modelo.Persona;

public interface PersonaService {
	
	public void crearPersona(Persona persona );
	
	public void obtenerPersona();
	
	public List<Persona> obtenerPersonas() ;
	
	public void actualizarPersona(Persona persona );


}
