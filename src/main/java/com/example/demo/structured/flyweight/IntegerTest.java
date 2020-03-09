package com.example.demo.structured.flyweight;

public class IntegerTest {
  public static void main(String[] args) {
    int i1 = 128;
    Integer i2 = new Integer(128);
    Integer i22 = new Integer(128);
    System.out.println("i1 == i2 : " + (i1 == i2)); // int 等于 Integer
    System.out.println("i2 == i22 : " + (i2 == i22)); // new Integer 不等于 new Integer
    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    System.out.println("i3 == i4 : " + (i3 == i4)); // valueOf源码中，-128 - 127 是从cache中获取的
    Integer i5 = Integer.valueOf(128);
    Integer i6 = Integer.valueOf(128);
    System.out.println("i5 == i6 : " + (i5 == i6));
  }
}
