package com.example.demo.structured.composite.employee;

import java.util.ArrayList;

public class Client {
  public static void main(String[] args) {
    Employee qq = new Employee("qq", new ArrayList<>());
    qq.getList().add(new Employee("qq1", new ArrayList<>()));
    qq.getList().get(0).getList().add(new Employee("qq11", new ArrayList<>()));
    System.out.println(qq);
  }
}
