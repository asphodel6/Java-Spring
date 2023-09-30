package com.example.mode2;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        int a = 10 / 0;
        System.out.println("Мы добавляем журнал в UniLibrary");
    }
}
