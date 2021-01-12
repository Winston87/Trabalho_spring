package com.winston.Trabalho.Recurso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winston.Trabalho.entidade.usuario;

@RestController
@RequestMapping(value = "/users")
public class usuarioRecurso {
	
	@GetMapping
	public ResponseEntity<usuario> findAll(){
		
		usuario user = new usuario(10L, "wisnton", "wisnton@gmail.com", "985928739", "0000");
		
		return ResponseEntity.ok().body(user);
	}

}
