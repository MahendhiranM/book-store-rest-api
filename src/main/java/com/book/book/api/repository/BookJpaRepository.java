package com.book.book.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.book.api.entity.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

	public List<Book> findByYearOfPublication(Integer yearOfPublication);
}
