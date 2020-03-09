package com.example.demo.behavior.command;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> list = new ArrayList<>();

	public void add(Order order){
		list.add(order);
	}

	public void execute(){
		list.stream().forEach(Order::execute);
	}
}
