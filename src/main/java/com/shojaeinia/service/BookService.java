package com.shojaeinia.service;

import com.shojaeinia.model.Book;
import com.shojaeinia.model.BookCreate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.shojaeinia.util.IdGenerator.generateId;

@Service
public class BookService {
    private static final List<Book> books = new ArrayList<>();

    public Book saveBook(BookCreate book) {
        String id = generateId();
        Book newBook = new Book(id, book.getName(), book.getAuthor());
        books.add(newBook);

        return newBook;
    }

    public List<Book> getBooks() {
        return books;
    }
}
