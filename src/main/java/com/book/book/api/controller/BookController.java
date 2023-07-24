package com.book.book.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.book.api.dto.BookDTO;
import com.book.book.api.entity.Book;
import com.book.book.api.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks(@RequestParam(value = "yearOfPublication", required = false) Integer yop){
		return bookService.getBooks(yop);
	}
	
	@GetMapping("/books/{id}")
	public BookDTO getBook(
			@RequestParam(value = "bookAuther", required = false) Boolean  bookAuther,
			@PathVariable("id") Integer id){
		
		return bookService.getBook(id, bookAuther);
	}
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book){
		return bookService.saveBook(book);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book){
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/books/{id}")
	public Boolean deleteBook(@PathVariable("id") Integer id){
		return bookService.deleteBook(id);
	}
}
