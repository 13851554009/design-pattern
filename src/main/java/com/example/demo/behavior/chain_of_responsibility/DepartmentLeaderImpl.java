package com.example.demo.behavior.chain_of_responsibility;

public class DepartmentLeaderImpl extends Leader {
  public DepartmentLeaderImpl(Leader leader) {
    super(leader);
  }

  @Override
  public void examine(int days) {
    if (days <= 5) {
      System.out.println("部门领导批假" + days + "天");
    } else {
      nextLeader.examine(days);
    }
  }
}
