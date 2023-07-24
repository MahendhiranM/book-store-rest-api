package com.book.book.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.book.api.entity.Author;

@Repository
public interface AuthorJpaRepository extends JpaRepository<Author, Integer>{

}
