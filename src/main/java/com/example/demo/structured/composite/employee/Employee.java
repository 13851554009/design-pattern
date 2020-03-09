package com.example.demo.structured.composite.employee;

import java.util.List;

public class Employee {
	private String name;
	private List<Employee> list;

	public Employee(String name, List<Employee> list) {
		this.name = name;
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", list=" + list +
				'}';
	}
}
