package com.example.demo.structured.bridge;

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
