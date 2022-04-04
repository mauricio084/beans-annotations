package com.javeriana.desarrolloweb.component;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("controller")
@ResponseBody
public class MyController {

	@GetMapping("hello")
	public String sayHello() {
		return "Hola mundo"; 
	}
}
