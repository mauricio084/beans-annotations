package com.javeriana.desarrolloweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante {
    
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;   
	private String codigo;	
    private String nombre;    
	private int edad;
    
    public Estudiante() {
	}
    
    public Estudiante(String codigo, String nombre, int edad) {
   	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
}