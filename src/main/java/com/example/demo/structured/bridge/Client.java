package com.example.demo.structured.bridge;

public class Client {
  public static void main(String[] args) {
	  Shape circularShape = new CircularShapeImpl(new RedColorImpl(), 2);
	  circularShape.draw();
	  Shape rectangleShape = new RectangleShapeImpl(new GreenColorImpl(), 2, 1);
	  rectangleShape.draw();
  }
}
