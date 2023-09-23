package com.example.mode1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.mode1")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
