package com.javeriana.desarrolloweb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.javeriana.desarrolloweb.entities.Estudiante;

@Repository
public interface EstudianteRepository extends PagingAndSortingRepository<Estudiante, Long> {
	
}
