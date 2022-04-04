package com.javeriana.desarrolloweb.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.javeriana.desarrolloweb.entities.Estudiante;

public interface EstudianteService {

	Page<Estudiante> getEstudiantes(Pageable pageable);
	
	Optional<Estudiante> getEstudianteById(Long id);
	
	Estudiante crearEstudiante(Estudiante estudiante);

}
