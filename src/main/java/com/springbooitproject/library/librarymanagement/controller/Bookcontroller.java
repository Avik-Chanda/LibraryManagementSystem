package com.springbooitproject.library.librarymanagement.controller;

import com.springbooitproject.library.librarymanagement.dto.ResponseDTO;
import com.springbooitproject.library.librarymanagement.entity.Books;
import com.springbooitproject.library.librarymanagement.services.BookServices;
import com.springbooitproject.library.librarymanagement.services.StudentBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bookcontroller {

    @Autowired
    private StudentBookServices sbServices;


    @Autowired
    private BookServices bookService;

    @DeleteMapping("/deleteBook/{id}")
    public ResponseDTO deleteBook(@PathVariable int id)
    {
        boolean isRecordExist = sbServices.isBookAssigned(id);
        ResponseDTO response = new ResponseDTO();
        if(isRecordExist)
        {
            Books deletedBook =  bookService.deleteBook(id);
            response.setBookId(deletedBook.getBook_id());
            response.setActive(deletedBook.isActive());
            response.setBookName(deletedBook.getBook_name());
            response.setMessage("Book deleted successfully (softly)");
        }
        else{
            Books book = bookService.getBookbyId(id);
            response.setBookId(book.getBook_id());
            response.setActive(book.isActive());
            response.setBookName(book.getBook_name());
            response.setMessage("Book cannot be deleted successfully as it is already assigned");
        }

        return response;
    }
}
