package com.example.demo.structured.proxy.jdk;

public class Test {
  public static void main(String[] args) {
	  Person person = (Person) new JdkProxy().getInstance(new Person_2Impl());
	  person.work();
  }
}
