package com.example.demo.structured.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
  public static void main(String[] args) {
    List<Persion> persions = new ArrayList<>();
    persions.add(new Persion("qq", 11));
    persions.add(new Persion("ww", 21));
    persions.add(new Persion("ee", 31));

    List<Persion> filter =
        persions.stream()
				.filter(persion -> persion.getAge() > 20)
				.collect(Collectors.toList());
    System.out.println(filter);
  }
}
