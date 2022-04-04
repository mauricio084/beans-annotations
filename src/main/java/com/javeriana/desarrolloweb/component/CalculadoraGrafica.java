package com.javeriana.desarrolloweb.component;

import org.springframework.stereotype.Service;

@Service("grafica")
public class CalculadoraGrafica implements ICalculadora{
	
	@Override
	public double sum(double a, double b) {
		return a+b;
	}
}
