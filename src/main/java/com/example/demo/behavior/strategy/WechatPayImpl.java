package com.example.demo.behavior.strategy;

public class WechatPayImpl implements IPayment {
    @Override
    public void pay() {
        System.out.println("wechatPay is working");
    }
}
