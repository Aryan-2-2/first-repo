package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Author;
import com.masai.entity.Book;
import com.masai.repository.AuthorDao;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
 	AuthorDao aDao;
	
	@Override
	public Author saveAuthor(Author author) {
	
		Book b = new Book();
		
		b.setAuthor(author);
		
		 return aDao.save(author);
		
	}

}
