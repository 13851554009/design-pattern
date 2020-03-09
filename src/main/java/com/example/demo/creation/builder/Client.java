package com.example.demo.creation.builder;

public class Client {
  public static void main(String[] args) {
    File file = new File.FileBuilder()
            .setLastMotifile("last")
            .setName("fileName")
            .setType("doc")
            .setUrl("http://")
            .build();
    System.out.println(file);
  }
}
