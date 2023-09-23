package com.example.mode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Mode1Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = context.getBean("myPerson", Person.class);
		person.callYourPet();
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		context.close();
	}

}
