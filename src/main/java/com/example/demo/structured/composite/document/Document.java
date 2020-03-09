package com.example.demo.structured.composite.document;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {
	protected String name;

	public Document(String name) {
		this.name = name;
	}

	protected abstract void print();
}
