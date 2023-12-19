package com.springboot.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.modelo.Persona;
import com.springboot.rest.service.PersonaService;

/**
 * 
 * Esta anotación se usa a nivel de clase. La anotación @RestController marca la
 * clase como un controlador donde cada método devuelve un objeto de dominio en
 * lugar de una vista. Al anotar una clase con esta anotación, ya no necesita
 * agregar @ResponseBody a todos los métodos RequestMapping. Significa que ya no
 * usa resuelve vistas ni envía HTML en respuesta. Simplemente envía el objeto
 * de dominio como una respuesta HTTP en el formato que entienden los
 * consumidores, como JSON
 **/
@RestController
@RequestMapping("/api")
public class PersonaController {

	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}

	/**
	 * esta anotación se utiliza para asignar solicitudes HTTP GET a métodos de
	 * controlador específicos.
	 * 
	 * @GetMapping es una anotación compuesta que actúa como un acceso directo
	 *             para @RequestMapping (method = RequestMethod.GET)
	 **/
	@GetMapping("/personas")
	public List<Persona> obtenerPersonas() {
		return personaService.obtenerPersonas();
	}

	/**
	 * Esta anotación se utiliza para asignar solicitudes HTTP POST a métodos de
	 * controlador específicos.
	 * 
	 * @PostMapping es una anotación compuesta que actúa como un acceso directo
	 *              para @RequestMapping (method = RequestMethod.POST). El método
	 *              POST lo utilizaremos en operaciones para crear nuevos elementos
	 * 
	 * 
	 * 
	 **/
	@PostMapping("/personas")
	public ResponseEntity<HttpStatus> crearPersona(@RequestBody Persona persona) {
		personaService.crearPersona(persona);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);

	}

	/**
	 * El método PUT es el que debemos utilizar para operaciones de actualización,
	 * para "updates", Utilizaremos PUT cuando queramos modificar un recurso en
	 * concreto que ya forma parte de la colección de recursos
	 **/
	@PutMapping("/personas")
	public ResponseEntity<HttpStatus> actualizarPersona(@RequestBody Persona persona) {
		personaService.actualizarPersona(persona);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);

	}

}
