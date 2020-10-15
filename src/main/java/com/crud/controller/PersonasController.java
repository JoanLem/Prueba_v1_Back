package com.crud.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.PersonaModel;

@Repository
public interface PersonasController extends JpaRepository<PersonaModel, Integer>{

}
