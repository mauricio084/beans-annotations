package com.javeriana.desarrolloweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyRestController {

	@Autowired
	@Qualifier("cientifica")
	ICalculadora calculadora;
	
	@GetMapping(value = "hello")
	public String sayHello() {
		return "Hola mundo"; 
	}
	
	@GetMapping(value = "sum")
	public double suma(@Param("a") double a, @Param("b") double b) {
		return calculadora.sum(a, b);
	}
}
