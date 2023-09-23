package com.example.mode1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig2 {

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(dogBean());
    }
}
