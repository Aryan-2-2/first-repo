package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {

@Id
private Integer	bookId;
private String	name;
private String	publication;
private String 	category;
private Integer	pages;
private Integer	price;
//kchxjnmxcbhdsxaz
@ManyToOne(cascade = CascadeType.ALL)
private Author author;

public Integer getBookId() {
	return bookId;
}

public void setBookId(Integer bookId) {
	this.bookId = bookId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPublication() {
	return publication;
}

public void setPublication(String publication) {
	this.publication = publication;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Integer getPages() {
	return pages;
}

public void setPages(Integer pages) {
	this.pages = pages;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

public Author getAuthor() {
	return author;
}

public void setAuthor(Author author) {
	this.author = author;
}





}
