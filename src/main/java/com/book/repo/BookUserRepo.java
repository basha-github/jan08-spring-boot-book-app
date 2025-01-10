package com.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.BookUser;

public interface BookUserRepo extends JpaRepository<BookUser, String> {

}
