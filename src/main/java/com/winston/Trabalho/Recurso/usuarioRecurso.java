package com.winston.Trabalho.Recurso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winston.Trabalho.entidade.usuario;

@RestController //esta anotaçao fala que e um recurso web que e controlado pelo um recurso rest
@RequestMapping(value = "/users") // nome do recurso rest usado na web
public class usuarioRecurso {
	
	@GetMapping // indica um tipo get do http 
	public ResponseEntity<usuario> retornoUser(){ // ResponseEntity e um tipo especifico de retorna resposta web
		
		usuario user = new usuario(10L, "wisnton", "wisnton@gmail.com", "985928739", "0000");
		
		return ResponseEntity.ok().body(user); // ResponseEntity este retorna a respsota com sucesso body respota o corpo da respota
	}

}
