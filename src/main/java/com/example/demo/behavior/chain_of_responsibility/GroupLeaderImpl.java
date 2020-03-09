package com.example.demo.behavior.chain_of_responsibility;

public class GroupLeaderImpl extends Leader {

  public GroupLeaderImpl(Leader leader) {
    super(leader);
  }

  @Override
  public void examine(int days) {
    if (days <= 3) {
      System.out.println("组长批假" + days + "天");
    } else {
      nextLeader.examine(days);
    }
  }
}
