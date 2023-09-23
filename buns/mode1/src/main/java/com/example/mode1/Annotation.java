package com.example.mode1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
