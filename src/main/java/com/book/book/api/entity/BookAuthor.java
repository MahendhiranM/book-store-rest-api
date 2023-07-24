package com.book.book.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookAuthor")
public class BookAuthor {
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="bookId", referencedColumnName = "id", nullable = false)
	private Book book;
	
	@ManyToOne
	@JoinColumn(name="authorId", referencedColumnName = "id", nullable = false)
	private Author author;

	public BookAuthor() {}
	
	public BookAuthor(Integer id, Book book, Author author) {
		super();
		this.id = id;
		this.book = book;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookAuthor [id=" + id + ", book=" + book + ", author=" + author + "]";
	}
	
	
}
