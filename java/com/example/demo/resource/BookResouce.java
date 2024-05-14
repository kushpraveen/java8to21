package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookDetailsService;

@RestController
public class BookResouce {

	@Autowired
	public BookDetailsService bookDetailsService;

	@GetMapping("/booksDetail")
	public List<Book> getAllBookDetails() {

		List<Book> bookdetails = bookDetailsService.getAllBookDetails();

		return bookdetails;
	}

	@GetMapping("/booksDetailById")
	public List<Book> getAllBookDetails(@RequestParam String id) {

		List<Book> result = bookDetailsService.getbookById(id);
		System.out.println(result);
		return bookDetailsService.getbookById(id);

		// return bookdetails;
	}
}
