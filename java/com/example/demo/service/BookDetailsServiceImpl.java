package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;

@Service
public class BookDetailsServiceImpl implements BookDetailsService {
	Logger log = LoggerFactory.getLogger(BookDetailsServiceImpl.class);

	List<Book> bookList, booklist2;

	@Override
	public List<Book> getAllBookDetails() {
		// TODO Auto-generated method stub
		bookList = new ArrayList<Book>();		
		bookList.add(new Book("1", "Java", "Javadesc"));
		bookList.add(new Book("2", "Python", "Javadesc"));
		bookList.add(new Book("3", "SpringBoot", "Javadesc"));
		
		bookList.add(new Book("4", "nodejs", "NodeDesc"));
		bookList.add(new Book("5", "react", "Reactdesc"));
				bookList.add(new Book("6", "Go", "Godesc"));

		return bookList;
	}

	@Override
	public List<Book> getbookById(String id) {
		bookList = this.getAllBookDetails();

		List<Book> bookById = new ArrayList<>();
		bookById = bookList.stream().filter(n -> n.getId().equals(id)).collect(Collectors.toList());
		log.debug("Book Data" + bookById);

		Optional<List<Book>> optional = Optional.ofNullable(bookById);
		return optional.get();
		// return bookById.get(0);
	}

}
