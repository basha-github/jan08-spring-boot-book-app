package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.BookUser;
import com.book.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	
	@PostMapping("/uday-publications/book/user/add")
	public BookUser addNewUser(@RequestBody BookUser bookUser) {
		
		return userService.saveNewUser(bookUser);
	}
	
	
	@GetMapping("/uday-publications/book/user/check")
	public boolean checkUser(@RequestParam String uName,String password) {
		
		return userService.isValidUser(uName,password);
	}
	
	
	
}
