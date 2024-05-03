package com.rahul.library.repository;

import com.rahul.library.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findAuthorByAuthorName(String authorName);

}
