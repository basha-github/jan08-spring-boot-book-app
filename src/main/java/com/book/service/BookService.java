package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;

	public Book saveIntoDB(Book book) {
		
		return bookRepo.save(book);
		
	}

	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}

	

}
