package com.javeriana.desarrolloweb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.desarrolloweb.dtos.EstudianteDTO;
import com.javeriana.desarrolloweb.entities.Estudiante;
import com.javeriana.desarrolloweb.exceptions.EstudianteNotFoundException;
import com.javeriana.desarrolloweb.service.EstudianteService;

@RestController
@RequestMapping("api")
public class EstudianteController {
	
    @Autowired
	private EstudianteService estudianteService;
    
    @Autowired
    private ModelMapper mapper;
    
    @GetMapping("get1")
    public String get112345() {
        return "Respuesta desde el metodo GET 1";
    }
	
	@GetMapping("get2")
    public String get2() {
        return "Respuesta desde el metodo GET 2";
    }
	
	@GetMapping("get3")
    public String get3() {
        return "Respuesta desde el metodo GET 3";
    }
	
	@PutMapping()
    public String put() {
        return "Respuesta desde el metodo PUT";
    }
	
	@PostMapping()
    public String post() {
        return "Respuesta desde el metodo POST";
    }
	
	@DeleteMapping()
    public String delete() {
        return "Respuesta desde el metodo DELETE";
    }
	
	@GetMapping(value = "getEstudiantes")
	public List<EstudianteDTO> getEstudiantes(@RequestParam(name = "page") int page,
			@RequestParam(name = "size", required = false, defaultValue = "10") int size) {
		
		Page<Estudiante> estudiantes = estudianteService.getEstudiantes(PageRequest.of(page, size));
		
		List<EstudianteDTO> res = new ArrayList<>();
		for (Estudiante estudiante : estudiantes) {
			res.add(mapper.map(estudiante, EstudianteDTO.class));
		}
		
		return res;
	}
	
	@GetMapping(value = "getEstudiante")
	public EstudianteDTO getEstudiante(@RequestParam("id") Long id) {
		Optional<Estudiante> estudiante = estudianteService.getEstudianteById(id);

		if (estudiante.isPresent()) {
			return mapper.map(estudiante.get(), EstudianteDTO.class);
		} else {
			throw new EstudianteNotFoundException(id);
		}
	}
	
	@PutMapping(value = "crear")
    public EstudianteDTO crearEstudiante(@RequestBody EstudianteDTO dto) {
		Estudiante estudiante = toEntity(dto);
		return toDTO(estudianteService.crearEstudiante(estudiante));
    }

	@PutMapping(value = "crear", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public EstudianteDTO crearEstudianteXML(@RequestBody EstudianteDTO dto) {
		Estudiante estudiante = toEntity(dto);
		return toDTO(estudianteService.crearEstudiante(estudiante));
	}
	
	private EstudianteDTO toDTO(Estudiante estudiante) {
		return mapper.map(estudiante, EstudianteDTO.class);
	}
	
	private Estudiante toEntity(EstudianteDTO dto) {
		return mapper.map(dto, Estudiante.class);
	}
	
//	@ExceptionHandler({ GeneralException.class})
//    public ErrorCode handleGeneralException() {
//    	return new ErrorCode(HttpStatus.INTERNAL_SERVER_ERROR, "General Excepcion");
//    }
//	
//    @ExceptionHandler({ EstudianteNotFoundException.class})
//    public ErrorCode handleEstudianteNotFoundException(EstudianteNotFoundException ex) {
//    	return new ErrorCode(HttpStatus.NO_CONTENT, ex.getMessage());
//    }
}
