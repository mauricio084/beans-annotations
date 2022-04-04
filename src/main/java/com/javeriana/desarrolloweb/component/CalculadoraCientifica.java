package com.javeriana.desarrolloweb.component;

import org.springframework.stereotype.Service;

@Service("cientifica")
public class CalculadoraCientifica implements ICalculadora {

	@Override
	public double sum(double a, double b) {
		return a+b;
	}
}
