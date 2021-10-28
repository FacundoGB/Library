package com.Excercise1.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//CONTROLADOR PAGINA PRINCIPAL //

@Controller()
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("")
	public String index() {
		return "index.html";
	}
	
}
