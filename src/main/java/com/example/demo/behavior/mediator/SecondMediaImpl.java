package com.example.demo.behavior.mediator;

public class SecondMediaImpl implements Media {
	@Override
	public void open(Mediator mediator) {
		System.out.println("设备二打开");
		mediator.openFirst();
	}

	@Override
	public void wakeup() {
		System.out.println("设备二被唤醒");
	}
}
