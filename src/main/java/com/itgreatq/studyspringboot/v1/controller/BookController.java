package com.itgreatq.studyspringboot.v1.controller;

import com.itgreatq.studyspringboot.v1.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@RestController
public class BookController {

    @GetMapping("/v1/book")
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
