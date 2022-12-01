package com.wayne;

import com.wayne.service.BookService;
import com.wayne.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
