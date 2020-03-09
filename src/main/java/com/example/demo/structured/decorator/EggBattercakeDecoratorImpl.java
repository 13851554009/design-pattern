package com.example.demo.structured.decorator;

public class EggBattercakeDecoratorImpl extends BattercakeDecorator {
	public EggBattercakeDecoratorImpl(Battercake battercake) {
		super(battercake);
	}

	@Override
	public String getMessage() {
		return super.getMessage() + " 加一个鸡蛋";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 2 ;
	}
}
