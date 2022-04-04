package com.javeriana.desarrolloweb.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
	public void sayHello(String var) {
		System.out.println("Hello World " + var); 
	}
}