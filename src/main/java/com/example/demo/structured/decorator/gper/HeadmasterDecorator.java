package com.example.demo.structured.decorator.gper;

import java.util.List;

public class HeadmasterDecorator extends Decorator {
	public HeadmasterDecorator(GperModule gperModule) {
		super(gperModule);
	}
	public List<String> getModules() {
		List<String> list = super.getModules();
		list.add("作业");
		list.add("题库");
		list.add("成长墙");
		list.add("老师红黑榜");
		list.add("班主任颜值榜");
		return list;
	}
}
