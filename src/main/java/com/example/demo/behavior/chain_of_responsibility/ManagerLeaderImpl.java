package com.example.demo.behavior.chain_of_responsibility;

public class ManagerLeaderImpl extends Leader {
	public ManagerLeaderImpl(Leader leader) {
		super(leader);
	}

	@Override
	public void examine(int days) {
		System.out.println("经理批假" + days + "天");
	}
}
