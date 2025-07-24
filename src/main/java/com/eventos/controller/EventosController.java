package com.eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.modals.Eventos;
import com.eventos.services.EventosServices;

@Controller
public class EventosController {

	private EventosServices eventosServices;

	public EventosController(EventosServices eventosServices) {
		super();
		this.eventosServices = eventosServices;
	}

	@GetMapping("/cadastro")
	public String formEventos() {
		return "form";
	}

	@PostMapping("/cadastro")
	public String formEventos(Eventos eventos) {
		eventosServices.save(eventos);
		return "redirect:/cadastro";
	}

	@GetMapping({ "/", "/eventos" })
	public ModelAndView listaEventos() {
		ModelAndView mw = new ModelAndView("index");
		Iterable<Eventos> eventos = eventosServices.listaEventos();
		mw.addObject("eventos", eventos);
		return mw;
	}
}
