package com.javeriana.desarrolloweb.ejercicio;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CalculadoraController {

	@GetMapping(value="sumar", produces = MediaType.APPLICATION_XML_VALUE)
	public Resultado sumar(@RequestParam("a") int a, @RequestParam("b") int b) {
		return new Resultado(a, b, a + b);
	}
	
	@GetMapping(value="sumar/{a}/{b}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Resultado sumarPathVariable(@PathVariable ("a") int a, @PathVariable("b") int b) {
		return new Resultado(a, b, a + b);
	}

	class Resultado {
		int a;
		int b;
		int res;
		
		public Resultado() {
		}
		
		public Resultado(int a, int b, int res) {
			super();
			this.a = a;
			this.b = b;
			this.res = res;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public int getRes() {
			return res;
		}

		public void setRes(int res) {
			this.res = res;
		}
	}
}
