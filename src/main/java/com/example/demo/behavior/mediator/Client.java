package com.example.demo.behavior.mediator;

public class Client {
  public static void main(String[] args) {
	  Media first = new FirstMediaImpl();
	  Media second = new SecondMediaImpl();
	  Media third = new ThirdMediaImpl();
	  Mediator mediator = new Mediator(first, second, third);

	  first.open(mediator);
  }
}
