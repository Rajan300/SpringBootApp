package com.example.springbootapp;

import com.example.springbootapp.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {

        User user = User.builder()
                .name("raj")
                .password("password")
                .email("raj@gmail.com")
                .build();
    }

}
