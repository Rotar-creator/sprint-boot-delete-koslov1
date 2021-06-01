package ru.Koslov.Sberbank.Sprint.sprintbootdelete.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Koslov.Sberbank.Sprint.sprintbootdelete.service.BookService;

@RestController
public class BookController {
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }
@PostMapping(path = "/book")
    public String createBook(String bookName) {
        service.createBook(bookName);
        return "Book was created";
    }
}
