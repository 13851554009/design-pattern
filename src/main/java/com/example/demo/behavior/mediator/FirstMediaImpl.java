package com.example.demo.behavior.mediator;

public class FirstMediaImpl implements Media {
	@Override
	public void open(Mediator mediator) {
    	System.out.println("设备一打开");
		mediator.openFirst();
	}

	@Override
	public void wakeup() {
		System.out.println("设备一被唤醒");
	}
}
