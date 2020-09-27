package com.springbooitproject.library.librarymanagement.services;

import com.springbooitproject.library.librarymanagement.entity.Books;
import com.springbooitproject.library.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepository;

    public Books deleteBook(int id){
        Books book = bookRepository.findById(id).orElse(null);
        book.setActive(false);
        return bookRepository.save(book);
    }

    public Books updateBooks(Books book){
        Books existingBook =  bookRepository.findById(book.getBook_id()).orElse(null);
        if(existingBook.isActive() == false)
        {
            return null;
        }
        existingBook.setBook_name(book.getBook_name());
        existingBook.setBook_author(book.getBook_author());
        existingBook.setActive(book.isActive());

        return bookRepository.save(existingBook);
    }

    public Books getBookbyId(int book_id)
    {
        return bookRepository.findById(book_id).orElse(null);
    }

    public List<Books> getAllBooks()
    {
        return bookRepository.findAll();
    }
}
