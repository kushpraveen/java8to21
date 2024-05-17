package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo.*"})
public class DemoApplication {

	public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
//		DemoApplication demoApplication = new DemoApplication();
////		
//		List<Book> books = 	demoApplication.getbookById("2");
//		System.out.println(books.getFirst().getName());
		
	}
	
//
//List<Book> bookList;
//	//@Override
//	public List<Book> getAllBookDetails() {
//		// TODO Auto-generated method stub
//		bookList = new ArrayList<Book>();
//		
//		bookList.add(new Book("1","Java","Javadesc1"));
//		bookList.add(new Book("2","Python","Javadesc2"));
//		bookList.add(new Book("3","SpringBoot","Javadesc3"));
//		
//		return bookList;
//	}
//	//@Override
//	public List<Book> getbookById(String id) {
//		bookList = this.getAllBookDetails();
//		
//		List<Book> bookById = new ArrayList<>(); 
//		bookById = bookList.stream().filter(n->n.getId().equals(id)).collect(Collectors.toList());
//		//bookList.stream().filter(n->n.getId().equals(id)).forEach(System.out::println);
//		// TODO Auto-generated method stub
//		
//		
////		for (Book book : bookList) {
////			if(book.getId()==id)
////				bookById.add(book);
////		}
//		return bookById;
//	} 

}
