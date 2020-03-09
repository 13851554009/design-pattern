package com.example.demo.behavior.interpreter;

public class Client {
  public static void main(String[] args) {
    Expression expression = new ExpressionImpl("i");
    System.out.println(expression.interpret("ji,12"));
  }
}
