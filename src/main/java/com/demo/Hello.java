package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hello {
    public static void main(String[] args) {
        System.out.println("-----------");
        SpringApplication.run(Hello.class, args);
    }
}
