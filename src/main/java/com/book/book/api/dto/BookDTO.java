package com.book.book.api.dto;

import java.util.List;

public class BookDTO {
	
	private Integer id;
	private String name;
	private String describtion;
	private Integer yearOfPublication;
	private String bookType;
	
	private List<AuthorDTO> authors;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public Integer getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public List<AuthorDTO> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorDTO> authors) {
		this.authors = authors;
	}
	
}
