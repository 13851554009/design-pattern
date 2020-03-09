package com.example.demo.structured.decorator.gper;

public class Test {
  public static void main(String[] args) {
    GperModule gperModule = new BaseGperModule();
    Decorator decorator = new Decorator(gperModule);

    TeacherDecorator teacher = new TeacherDecorator(decorator);
    System.out.println(teacher.getModules());

    HeadmasterDecorator headmaster = new HeadmasterDecorator(decorator);
    System.out.println(headmaster.getModules());
  }
}
