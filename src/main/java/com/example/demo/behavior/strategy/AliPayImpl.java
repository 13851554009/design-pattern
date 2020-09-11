package com.example.demo.behavior.strategy;

public class AliPayImpl implements IPayment {
    @Override
    public void pay() {
        System.out.println("alipay is working");
    }
}
