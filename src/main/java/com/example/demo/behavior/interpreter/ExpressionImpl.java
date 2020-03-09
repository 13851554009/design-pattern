package com.example.demo.behavior.interpreter;

public class ExpressionImpl implements Expression {
	private String data;

	public ExpressionImpl(String data) {
		this.data = data;
	}

	@Override
	public String interpret(String context) {
		int index = context.indexOf(data);
		if(index >= 0){
			return data+"的下标是："+index;
		} else {
			return "不存在";
		}
	}
}
