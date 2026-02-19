package com.codewithmosh.store;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

     public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private final PaymentService paymentService;

    public void placeOrder() {
        System.out.println("Placing order...");
        paymentService.processPayment(100.0);
    }

}
