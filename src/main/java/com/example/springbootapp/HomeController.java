package com.example.springbootapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/hello")
    public  String index() {
        System.out.println("appName: " + appName);
        return "index.html";
    }
}
