package com.example.demo.structured.proxy.cglib;

public class Test {
  public static void main(String[] args) {
	 Person person = (Person) new Cglib().getInstance(new Person_1Impl());

	 person.work();
  }
}
