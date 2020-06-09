package com.itgreatq.studyspringboot.controller;

import com.itgreatq.studyspringboot.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getJSONbook(){
        Book book = new Book();
        book.setId(UUID.randomUUID());
        book.setBookName("浪潮之巅");
        book.setAuthor("吴军");
        book.setPrice(new BigDecimal("20.00"));
        book.setPublicationDate(LocalDate.now());
        return book;
    }
}
