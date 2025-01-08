package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookService;

@RestController
@CrossOrigin("*")
public class BookController {
	
	@Autowired
	BookService bookService;

	@PostMapping("/uday-publications/book/add")
	public Book addNewBook(@RequestBody Book book ) {
		
		//System.out.println("from react....book..."+book);
		
		return bookService.saveIntoDB(book);
		
	}
	
	
}
