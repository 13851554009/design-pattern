package com.example.demo.behavior.chain_of_responsibility;

public abstract class Leader {
	protected Leader nextLeader;

	public Leader(Leader leader) {
		this.nextLeader = leader;
	}
	abstract void examine(int days);
}
