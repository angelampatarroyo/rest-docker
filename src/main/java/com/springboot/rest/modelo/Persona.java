package com.springboot.rest.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

	@Id
	private Long id;
	private String tipoId;

	private String nombre;
	private String telefono;
	private String email;

	
}
