package com.example.mode1;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
