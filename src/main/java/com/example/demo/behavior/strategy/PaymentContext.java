package com.example.demo.behavior.strategy;

public class PaymentContext {
    private IPayment iPayment;

    public void execute(String paymentClassName) {
        try {
            iPayment = (IPayment) Class.forName(paymentClassName).newInstance();
            iPayment.pay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
