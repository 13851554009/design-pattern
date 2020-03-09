package com.example.demo.behavior.command;

public class Client {
  public static void main(String[] args) {
	  Broker broker = new Broker();
	  broker.add(new FirstOrderImpl());
	  broker.add(new SecondOrderImpl());
	  broker.execute();
  }
}
