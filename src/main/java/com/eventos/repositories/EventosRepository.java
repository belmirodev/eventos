package com.eventos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventos.modals.Eventos;

public interface EventosRepository extends CrudRepository<Eventos, Long> {

}
