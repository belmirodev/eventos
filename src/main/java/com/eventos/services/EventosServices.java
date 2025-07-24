package com.eventos.services;

import org.springframework.stereotype.Service;

import com.eventos.modals.Eventos;
import com.eventos.repositories.EventosRepository;

@Service
public class EventosServices {

	private EventosRepository eventosRepository;

	public EventosServices(EventosRepository eventosRepository) {
		super();
		this.eventosRepository = eventosRepository;
	}

	public void save(Eventos eventos) {
		eventosRepository.save(eventos);
	}

	public Iterable<Eventos> listaEventos() {
		Iterable<Eventos> lista = eventosRepository.findAll();
		return lista;
	}

}
