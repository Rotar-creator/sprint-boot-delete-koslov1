package ru.Koslov.Sberbank.Sprint.sprintbootdelete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Koslov.Sberbank.Sprint.sprintbootdelete.model.Book;
import ru.Koslov.Sberbank.Sprint.sprintbootdelete.repository.InMemoryBookRepository;

import java.util.UUID;

@Service
public class BookService {
    // @Autowired
    private InMemoryBookRepository repo;
@Autowired
    public BookService(InMemoryBookRepository repo) {
        this.repo = repo;
    }

    public Book createBook(String bookName) {
        Book newBook = new Book(UUID.randomUUID().toString(), bookName);
        return repo.saveandUpdate(newBook);
    }
}
