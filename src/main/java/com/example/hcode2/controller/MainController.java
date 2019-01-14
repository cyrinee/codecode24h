package com.example.hcode2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hcode2.Models.Personne;
import com.example.hcode2.Models.crud.PersonneRepository;

@Controller    
@RequestMapping(path="/demo") 
public class MainController {
	@Autowired 
	private PersonneRepository personneRepository;

	@GetMapping("/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		
System.out.println("person saved");
		Personne n = new Personne();
		n.setNom(name);
		n.setEmail(email);
		personneRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Personne> getAllUsers() {
		return personneRepository.findAll();
	}
}