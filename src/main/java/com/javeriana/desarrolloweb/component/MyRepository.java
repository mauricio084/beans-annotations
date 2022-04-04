package com.javeriana.desarrolloweb.component;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javeriana.desarrolloweb.entities.Estudiante;

@Repository
public interface MyRepository extends JpaRepository<Estudiante, Long>{

}
