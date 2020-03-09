package com.example.demo.structured.decorator;

public class BattercakeDecorator implements Battercake{
	private Battercake battercake;

	public BattercakeDecorator(Battercake battercake) {
		this.battercake = battercake;
	}

	@Override
	public String getMessage(){
		return battercake.getMessage();
	}

	@Override
	public int getPrice(){
		return battercake.getPrice();
	}
}
