package com.example.demo.behavior.command;

public class FirstOrderImpl implements Order {
	@Override
	public void execute() {
		System.out.println("第一个命令开始执行");
	}
}
