package com.example.demo.structured.flyweight;

import java.util.HashMap;

public class Factory {
	private static final HashMap<String, Persion> map = new HashMap<>();

	public Persion get(String id){
		Object obj = map.get(id);
		if(obj == null){
			return  new Persion("qq", 1);
		}
		return (Persion) obj;
	}
}
