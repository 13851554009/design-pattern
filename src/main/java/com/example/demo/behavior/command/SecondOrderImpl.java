package com.example.demo.behavior.command;

public class SecondOrderImpl implements Order {
	@Override
	public void execute() {
    	System.out.println("第二个命令开始执行");
	}
}
