package com.example.mode2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Евгений Онегин")
    private String name;

    @Value("А.С. Пушкин")
    private String author;

    @Value("1833")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }
}
