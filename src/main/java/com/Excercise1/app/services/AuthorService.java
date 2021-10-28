package com.Excercise1.app.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Excercise1.app.Entity.AuthorEntity;
import com.Excercise1.app.repository.AuthorRepo;


@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepo repo;
	
	
	// REGISTER AUTHOR //
	public void registerAuthor(String name) {
		
		AuthorEntity author = new AuthorEntity();
		author.setId(randID());
		author.setName(name);
		author.setRegister(true);
		
		repo.save(author);
	}
	
	
	// DELETES AUTHOR BY ID //
	public void deleteAuthor(Integer id) {
		repo.deleteById(id);
	}
	
	
	// LISTS ALL AUTHORS //
	public List<AuthorEntity> listAuthor(){
		return repo.findAll();
		
		//List<AuthorEntity> authors = repo.findAll();
		
		//return authors;
		//se puede resumir a una linea todo en return
	}
	
	
	// MODIFY AUTHOR BY ID WITH NEW NAME //
	public void modifyAuthor(Integer id, String name) {
		AuthorEntity author = repo.getById(id);
		//author = repo.getById(Id);
		// ahora trabajamos un autor
		author.setName(name);
		// cambiamos nombre
		repo.save(author);
		// guardamos cambio
	
	}
	
	public AuthorEntity returnAuthor(int id) {
		AuthorEntity a = repo.getById(id);
		return a;
	}
	

	
	
	///// METODOS INTERNOS /////


	// Cambia el GeneratedValue pero solo util en proyectos chicos
	public int randID(){
		String uuid = UUID.randomUUID().toString();
		int id = uuid.hashCode();
		id = id<0?-id:id;

		return  id;
	}
	


}
