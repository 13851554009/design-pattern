package com.example.demo.behavior.strategy;

public class JDPayImpl implements IPayment {
    @Override
    public void pay() {
        System.out.println("JDPay is working");
    }
}
