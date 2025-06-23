package com.example.springbootapp;


import org.springframework.stereotype.Service;

@Service("paypal")
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amt) {
        System.out.println("PayPal Payment");
    }
}
