package com.book.book.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="authors")
public class Author {

	@Id
	private Integer id;
	private String name;
	private String gender;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;
	
	public Author() {}
	
	public Author(Integer id, String name, String gender, LocalDateTime createAt, LocalDateTime updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.createAt = createAt;
		this.updateAt = updateAt;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", gender=" + gender + ", createAt=" + createAt + ", updateAt="
				+ updateAt + "]";
	}
}
