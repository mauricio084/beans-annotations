package com.javeriana.desarrolloweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javeriana.desarrolloweb.entities.Estudiante;
import com.javeriana.desarrolloweb.repository.EstudianteRepository;

@Configuration
class LoadData {

	@Bean
	CommandLineRunner initDatabaseEquipos(EstudianteRepository estudianteRepository) {
		return args -> {
			System.out.println("Probando los repositorios Spring Data JPA");

			Estudiante e = new Estudiante();
			e.setCodigo("001");
			e.setNombre("Fernando");
			e.setEdad(21);
			estudianteRepository.save(e);
			
			e = new Estudiante();
			e.setCodigo("002");
			e.setNombre("Juanito Carrasco");
			e.setEdad(20);
			estudianteRepository.save(e);
			
		};
	}
	
}
