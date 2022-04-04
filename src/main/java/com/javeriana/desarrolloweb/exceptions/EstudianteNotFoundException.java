package com.javeriana.desarrolloweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EstudianteNotFoundException extends RuntimeException {

	public EstudianteNotFoundException(Long id) {
		super("Estudiante no encontrado: " + id);
	}
}



