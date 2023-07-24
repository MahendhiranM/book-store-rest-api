package com.book.book.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.api.dto.AuthorDTO;
import com.book.book.api.dto.BookDTO;
import com.book.book.api.entity.Author;
import com.book.book.api.entity.Book;
import com.book.book.api.entity.BookAuthor;
import com.book.book.api.repository.BookAuthorJpaRepository;
import com.book.book.api.repository.BookJpaRepository;

@Service
public class BookService {
	
	@Autowired
	private BookJpaRepository bookJpaRepository;
	
	@Autowired
	private BookAuthorJpaRepository bookAuthorJpaRepository;
	
	public List<Book> getBooks(Integer yop){
		if(yop==null) 
			return bookJpaRepository.findAll();
		return bookJpaRepository.findByYearOfPublication(yop);
	}

	public BookDTO getBook(Integer id, Boolean bookAuther) {
		
		Book book = bookJpaRepository.findById(id).get();
		
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId());
		bookDTO.setName(book.getName());
		bookDTO.setDescribtion(book.getDescribtion());
		bookDTO.setYearOfPublication(book.getYearOfPublication());
		bookDTO.setBookType(book.getBookType());
		
		if(bookAuther) {
			List<BookAuthor> bookAuthors = bookAuthorJpaRepository.findAllByBookId(id);
			List<AuthorDTO> authors = new ArrayList<>();
			bookAuthors.forEach(bookAuthor->{
				Author author = bookAuthor.getAuthor();
				AuthorDTO authorDTO = new AuthorDTO();
				authorDTO.setId(author.getId());
				authorDTO.setName(author.getName());
				authorDTO.setGender(author.getGender());
				authors.add(authorDTO);
			});
			bookDTO.setAuthors(authors);
		}
	
		return bookDTO;
	}

	public Book saveBook(Book book) {
		bookJpaRepository.save(book);
		return book;
	}

	public Book updateBook(Book book) {
		bookJpaRepository.save(book);
		return book;
	}

	public Boolean deleteBook(Integer id) {
		bookJpaRepository.deleteById(id);
		return Boolean.TRUE;
	}
	
	
}
