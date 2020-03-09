package com.example.demo.behavior.mediator;

public class ThirdMediaImpl implements Media {
	@Override
	public void open(Mediator mediator) {
		System.out.println("设备三打开");
		mediator.openFirst();
	}

	@Override
	public void wakeup() {
		System.out.println("设备三被唤醒");
	}
}
