package com.book.book.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.book.api.entity.BookAuthor;

@Repository
public interface BookAuthorJpaRepository extends JpaRepository<BookAuthor, Integer> {

	public List<BookAuthor> findAllByBookId(Integer id);

}
