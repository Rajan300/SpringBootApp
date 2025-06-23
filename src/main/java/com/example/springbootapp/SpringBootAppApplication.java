package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringBootAppApplication.class, args);
//        var OrderService = new OrderService();
//        OrderService.placeOrder();
        //PaymentService paymentService = null
         ApplicationContext context=SpringApplication.run(SpringBootAppApplication.class, args);
        //var orderService= context.getBean(OrderService.class);
        //OrderService orderService = new OrderService(new PayPalPaymentService());
       // orderService.setPaymentService(new PayPalPaymentService());
//        var OrderService = new OrderService(new PayPalPaymentService());
//        orderService.placeOrder();
       var manager = context.getBean(OrderService.class);
       manager.placeOrder();

    }

}
