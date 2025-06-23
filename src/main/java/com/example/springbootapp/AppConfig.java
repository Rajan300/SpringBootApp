package com.example.springbootapp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }


}
