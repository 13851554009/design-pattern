package com.example.demo.structured.decorator;

public class BattercakeImpl implements Battercake {
	@Override
	public String getMessage() {
		return "获取一个煎饼";
	}

	@Override
	public int getPrice() {
		return 3;
	}
}
