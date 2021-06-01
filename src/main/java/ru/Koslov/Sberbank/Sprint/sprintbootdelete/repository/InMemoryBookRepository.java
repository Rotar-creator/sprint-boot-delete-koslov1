package ru.Koslov.Sberbank.Sprint.sprintbootdelete.repository;
import org.springframework.stereotype.Component;
import ru.Koslov.Sberbank.Sprint.sprintbootdelete.model.Book;


import java.util.HashMap;

import java.util.Map;
import java.util.Optional;

@Component
public class InMemoryBookRepository {
    private Map<String, Book> store = new HashMap<>();

    public Book saveandUpdate(Book book) {
         store.put(book.getId(), book);
        // store.put(book.toString(), book);
        return book;
    }

    public Optional<Book> getById(String id) {
        return Optional.ofNullable(store.get(id));
    }

}
