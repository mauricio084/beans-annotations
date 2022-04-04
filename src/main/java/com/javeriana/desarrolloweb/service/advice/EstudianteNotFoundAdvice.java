package com.javeriana.desarrolloweb.service.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javeriana.desarrolloweb.exceptions.EstudianteNotFoundException;
import com.javeriana.desarrolloweb.exceptions.GeneralException;

@ControllerAdvice
class EstudianteNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(value = { EstudianteNotFoundException.class, GeneralException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String estudianteNotFoundHandler(EstudianteNotFoundException ex) {
		return ex.getMessage();
	}
}
