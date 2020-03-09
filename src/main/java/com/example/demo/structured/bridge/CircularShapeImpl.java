package com.example.demo.structured.bridge;

public class CircularShapeImpl extends Shape {
  private int r;

  public CircularShapeImpl(Color color, int r) {
    super(color);
    this.r = r;
  }

  @Override
  public void draw() {
	  System.out.println("画一个圆，半径="+ r +" ,颜色="+ color.getColor());
  }
}
