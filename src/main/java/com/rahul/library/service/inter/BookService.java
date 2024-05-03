package com.rahul.library.service.inter;

import com.rahul.library.dto.BookFormDto;
import com.rahul.library.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    List<Book> findNewBooks();

    Book findById(int id);

    List<Book> findBookByNameContainsIgnoreCase(String name);

    List<Book> findBookByNameContainsIgnoreCaseOrderByAddedDateDesc(String name);

    List<Book> findBookByNameContainsIgnoreCaseOrderByName(String name);

    List<Book> searchAndSort(String name, String sortType);

    void saveBookForm(BookFormDto bookFormDto);

    BookFormDto convertToBookFormDto(Book book);

    void deleteBookById(int id);

}
