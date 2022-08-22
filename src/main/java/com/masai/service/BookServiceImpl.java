package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Author;
import com.masai.entity.Book;
import com.masai.repository.AuthorDao;
import com.masai.repository.BooksDao;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BooksDao bookDao;
	
	@Autowired
	AuthorDao ad;
	
	@Override
	public Book saveBook(Book book) {
		


	
	return	bookDao.save(book);
		
	}

	
	
}
