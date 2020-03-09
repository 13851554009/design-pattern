package com.example.demo.structured.decorator.gper;

import java.util.List;

public class Decorator implements GperModule{
	protected GperModule gperModule;

	public Decorator(GperModule gperModule) {
		this.gperModule = gperModule;
	}

	@Override
	public List<String> getModules() {
		return gperModule.getModules();
	}
}
