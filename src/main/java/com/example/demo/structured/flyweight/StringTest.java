package com.example.demo.structured.flyweight;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "he" + "llo";
    String s4 = "he";
    String s5 = "llo";
    String s6 = s4 + s5;
    String s7 = new String("hello");
    System.out.println("s1 == s2 :" + (s1 == s2));	//同一个常量
    System.out.println("s1 == s3 :" + (s1 == s3));	//编译时"he" + "llo"优化成"hello"
    System.out.println("s1 == s6 :" + (s1 == s6));	//编译时s4 s5是引用（类似分派调用）
    System.out.println("s1 == s7 :" + (s1 == s7));	//new 新的地址引用
  }
}
