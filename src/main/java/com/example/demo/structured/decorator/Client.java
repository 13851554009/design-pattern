package com.example.demo.structured.decorator;

public class Client {
  public static void main(String[] args) {
	  Battercake battercake = new BattercakeImpl();
	  BattercakeDecorator decorator = new BattercakeDecorator(battercake);
	  EggBattercakeDecoratorImpl egg = new EggBattercakeDecoratorImpl(decorator);
	  HotdogBattercakeDecoratorImpl hotdog = new HotdogBattercakeDecoratorImpl(egg);
	  System.out.println(hotdog.getMessage() +" : "+ hotdog.getPrice());
  }
}
