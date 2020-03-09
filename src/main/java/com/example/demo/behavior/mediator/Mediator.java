package com.example.demo.behavior.mediator;

public class Mediator {
	private Media first;
	private Media second;
	private Media third;

	public Mediator(Media first, Media second, Media third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void openFirst(){
		second.wakeup();
		third.wakeup();
	}

	public void openSecond(){
		first.wakeup();
		third.wakeup();
	}

	public void openThird(){
		first.wakeup();
		second.wakeup();
	}
}
