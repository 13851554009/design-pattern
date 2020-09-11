package com.example.demo.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.execute("com.example.demo.behavior.strategy.WechatPayImpl");
        paymentContext.execute("com.example.demo.behavior.strategy.AliPayImpl");
        paymentContext.execute("com.example.demo.behavior.strategy.JDPayImpl");
    }
}
