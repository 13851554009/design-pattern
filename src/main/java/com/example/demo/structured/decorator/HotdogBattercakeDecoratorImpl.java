package com.example.demo.structured.decorator;

public class HotdogBattercakeDecoratorImpl extends BattercakeDecorator {
	public HotdogBattercakeDecoratorImpl(Battercake battercake) {
		super(battercake);
	}

	@Override
	public String getMessage() {
		return super.getMessage() + " 加一个热狗";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 5 ;
	}
}
