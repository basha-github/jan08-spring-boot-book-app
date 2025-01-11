package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/uday-publications/book/user/update")
	public BookUser updateUser(@RequestParam String uName,String newPassword) {
		
		return userService.updateUserDetails(uName,newPassword);
	}
	
	@DeleteMapping("/uday-publications/book/user/delete")
	public String deleteUser(@RequestParam String uName) {
		
		return userService.deleteUser(uName);
	}
	
	@GetMapping("/uday-publications/book/user/get/all")
	public List<BookUser> getAllUsers(){
		
		return userService.getAllUsers();
	}
	
	
}
