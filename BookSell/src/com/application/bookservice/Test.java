package com.application.bookservice;

import com.application.book.controller.BookController;

public class Test {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("Hope");
		book.setAuthor("Mihir");
		System.out.println(book);
		
		BookController bookController = new BookController();
		bookController.read();
	}

}
