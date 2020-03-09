package com.example.demo.behavior.chain_of_responsibility;

public class Client {
  public static void main(String[] args) {
  	Leader manager = new ManagerLeaderImpl(null);
  	Leader department = new DepartmentLeaderImpl(manager);
	Leader group = new GroupLeaderImpl(department);
	group.examine(1);
	group.examine(4);
	group.examine(7);
  }
}
