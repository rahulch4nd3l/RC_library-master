package com.rahul.library.controller;

import com.rahul.library.entity.Book;
import com.rahul.library.service.inter.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class IndexController {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

    private final BookService bookService;

    public IndexController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("newBooks", bookService.findNewBooks());
        return "index";
    }

    @GetMapping("/book")
    public String showBook(@RequestParam("id") int id, Model model) {
        Book book = bookService.findById(id);
        String addedDate = dateFormat.format(book.getAddedDate());
        model.addAttribute("book", book);
        model.addAttribute("addedDate", addedDate);

        return "book";
    }

    @GetMapping("/search")
    public String showSearch(@RequestParam(value = "q", required = false) String question,
                             @RequestParam(value = "sort", required = false) String sortType,
                             Model model) {
        List<Book> books = bookService.searchAndSort(question, sortType);
        model.addAttribute("books", books);
        return "search";
    }

    @GetMapping("/contact")
    public String showContact() {
        return "contact";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
