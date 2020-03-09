package com.example.demo.structured.bridge;

public class RectangleShapeImpl extends Shape {
	private int x,y;

	public RectangleShapeImpl(Color color, int x, int y) {
		super(color);
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("画一个矩形，长="+x +"，宽="+ y +"，颜色="+ color.getColor());
	}
}
