package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;

@Service
public class BookDetailsServiceImpl implements BookDetailsService
{
	
List<Book> bookList;
	@Override
	public List<Book> getAllBookDetails() {
		// TODO Auto-generated method stub
		bookList = new ArrayList<Book>();
		
		bookList.add(new Book("1","Java","Javadesc"));
		bookList.add(new Book("2","Python","Javadesc"));
		bookList.add(new Book("3","SpringBoot","Javadesc"));
		
		return bookList;
	}
	@Override
	public List<Book> getbookById(String id) {
		bookList = this.getAllBookDetails();
		
		List<Book> bookById = new ArrayList<>(); 
		bookById = bookList.stream().filter(n->n.getId().equals(id)).collect(Collectors.toList());
		//bookList.stream().filter(n->n.getId().equals(id)).forEach(System.out::println);
		// TODO Auto-generated method stub
		
		
//		for (Book book : bookList) {
//			if(book.getId()==id)
//				bookById.add(book);
//		}
		
	Optional<List<Book>> optional =	Optional.ofNullable(bookById);
	return optional.get();
		//return bookById.get(0);
	} 

	
	
}
