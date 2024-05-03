package com.rahul.library.repository;

import com.rahul.library.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

    Genre findGenreByGenreName(String genreName);

}
