package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.BookUser;
import com.book.repo.BookUserRepo;

@Service
public class UserService {
	
	@Autowired
	BookUserRepo bookUserRepo;

	public BookUser saveNewUser(BookUser bookUser) {
		return bookUserRepo.save(bookUser);
	}

	public boolean isValidUser(String uName, String password) {
		
		try {
			
			BookUser bookUser = bookUserRepo.findById(uName).get();
			if(bookUser !=null) {
				if(bookUser.getUserName().contentEquals(uName)) {
					if(bookUser.getPassword().contentEquals(password)) {
						return true;
					}
				}
			}
				
		}catch(Exception e) {
			return false;
		}
		
		return false;
	}

	public BookUser updateUserDetails(String uName, String newPassword) {
		
		try {
			BookUser bookUser = bookUserRepo.findById(uName).orElse(
					new BookUser() );
			
			if( (bookUser !=null) &&(bookUser.getUserName() != null) &&
					(bookUser.getUserName().equals(uName))){
				BookUser newBookUser = new BookUser(uName,newPassword);
				return bookUserRepo.save(newBookUser);
						
			}
				
		}catch(Exception e) {
			System.out.println("Error Occurred while finding Record..");
			e.printStackTrace();
		}
		return new BookUser();
	}

	public String deleteUser(String uName) {
		String res = "";
		try{
			BookUser bookUser = bookUserRepo.findById(uName).get();
			bookUserRepo.deleteById(uName);
			res = "Successfully Deleted user--->"+uName;
		}catch(Exception e) {
			res = "No record found for user--->"+uName;
		}
		
		return res;
	}

	public List<BookUser> getAllUsers() {
		return bookUserRepo.findAll();
	}

	
}
