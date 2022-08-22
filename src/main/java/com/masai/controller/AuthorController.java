package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Author;
import com.masai.entity.Book;
import com.masai.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService; 
	
	@PostMapping("/author")
	public Author saveAuthor(@RequestBody Author author) {
		
	return	authorService.saveAuthor(author);
	}
	
}
