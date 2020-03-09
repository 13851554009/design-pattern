package com.example.demo.structured.facade;

public class Maker {
	private Module1 module1;
	private Module2 module2;

	public Maker() {
		this.module1 = new Module1();
		this.module2 = new Module2();
	}

	public void on(){
		module1.on();
		module2.on();
	}

	public void off(){
		module1.off();
		module2.off();
	}
}
