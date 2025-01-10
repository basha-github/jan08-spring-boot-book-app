package com.book.service;

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

	
}
