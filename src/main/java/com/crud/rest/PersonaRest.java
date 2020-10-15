package com.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import com.crud.controller.PersonasController;
import com.crud.model.PersonaModel;
 

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("api/v1/personas")
public class PersonaRest {

	@Autowired
	private PersonasController PersonaDAO;
	 
	@PostMapping("/save")
	public void save(@RequestBody PersonaModel persona) {
		PersonaDAO.save(persona);
	}
	
	 @GetMapping("/list")
	 public List<PersonaModel> list(){
		 return PersonaDAO.findAll();
		 
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable("id") Integer id) {
		 PersonaDAO.deleteById(id);
	 }
	 
	 @PutMapping("/update")
	 public void update(@RequestBody PersonaModel persona) {
		 PersonaDAO.save(persona);
	}
}
