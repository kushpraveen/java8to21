package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;


public interface BookDetailsService {

	public List<Book> getAllBookDetails();	
	public List<Book> getbookById(String id);
}
