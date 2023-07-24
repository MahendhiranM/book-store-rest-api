package com.book.book.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	private Integer id;
	private String name;
	private String describtion;
	private Integer yearOfPublication;
	private String bookType;
	public Book() {}
	public Book(Integer id, String name, String describtion, Integer yearOfPublication, String bookType) {
		super();
		this.id = id;
		this.name = name;
		this.describtion = describtion;
		this.yearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", describtion=" + describtion + ", yearOfPublication=" + yearOfPublication
				+ ", bookType=" + bookType + "]";
	}
}
