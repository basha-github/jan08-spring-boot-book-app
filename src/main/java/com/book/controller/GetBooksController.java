package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookService;

@RestController
@CrossOrigin("*")
public class GetBooksController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/uday-publications/book/get/all")
	public List<Book> getAllBooks(){
		
		return bookService.getAllBooks();
	}

	
}
