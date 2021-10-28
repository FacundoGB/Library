package com.Excercise1.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Excercise1.app.Entity.AuthorEntity;
import com.Excercise1.app.services.AuthorService;

@Controller
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
	
	
	// LISTAR AUTORES //
	@GetMapping("/list")
	public String listAuthors(ModelMap model){
		List<AuthorEntity> authors = service.listAuthor();
		model.addAttribute("authors", authors);
		
		return "Author";
	}
	
	// CREAR AUTORES //
	@GetMapping("/create")
	public String addAuthors(){
		
		return "regusr.html";		
	}
	
	
	// ENVIA INFO A LA BD //
	@PostMapping("/create")
	public String sendAuthorInfo(ModelMap model, @RequestParam String name) {
		
		service.registerAuthor(name);
		//creamos y vamos para atras
		return "redirect:/author/list";
	}

	// ELIMINAR //
	@GetMapping("/delete/{id}")
	public String deleteAuthor(@PathVariable int id) {
		service.deleteAuthor(id);
		return "redirect:/author/list";
	}

	//  MODIFICAR  //
	@GetMapping("/modify/{id}")
	public String modAuthor(ModelMap model, @PathVariable int id) {
		AuthorEntity a = service.returnAuthor(id);
		model.addAttribute("author", a);
		
		return "modusr.html";
	}
	
	@PostMapping("/modify/{id}")
	public String modify(@PathVariable int id, @RequestParam String name) {

		service.modifyAuthor(id, name);
		return "redirect:/author/list";
	}
	
}
