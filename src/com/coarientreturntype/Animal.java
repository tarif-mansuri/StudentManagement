package com.coarientreturntype;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String eat() {
		return "Animal is eating..";
	}

}
