package com.eventos.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String formEventos() {
		return "form";
	}
	
	
}
