package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Book;
import com.masai.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
    	
    	return bookService.saveBook(book);
    	
    }
	
}
