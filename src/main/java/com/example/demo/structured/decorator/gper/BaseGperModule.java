package com.example.demo.structured.decorator.gper;

import java.util.ArrayList;
import java.util.List;

public class BaseGperModule implements GperModule {
	public List<String> getModules(){
		List list = new ArrayList<String>();
		list.add("回答");
		list.add("文章");
		list.add("精品课");
		list.add("咕泡");
		list.add("商城");
		return list;
	}
}
