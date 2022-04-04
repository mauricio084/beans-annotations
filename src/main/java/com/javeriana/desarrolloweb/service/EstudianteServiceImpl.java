package com.javeriana.desarrolloweb.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.javeriana.desarrolloweb.entities.Estudiante;
import com.javeriana.desarrolloweb.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	private EstudianteRepository estudianteRepository;
	
	public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
		this.estudianteRepository = estudianteRepository;
	}
	
	@Override
	public Page<Estudiante> getEstudiantes(Pageable pageable){
		return estudianteRepository.findAll(pageable);
	}
	
	@Override
	public Optional<Estudiante> getEstudianteById(Long id){
		return estudianteRepository.findById(id);
	}
	
	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}
	
}