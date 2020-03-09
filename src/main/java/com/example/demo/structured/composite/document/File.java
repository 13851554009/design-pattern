package com.example.demo.structured.composite.document;

public class File extends Document {
	public File(String name) {
		super(name);
	}

	@Override
	protected void print() {
		System.out.println(name);
	}
}
