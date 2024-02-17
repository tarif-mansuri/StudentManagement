package com.inheritance;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("Person is eating...");
	}
	
	public void poop() {
		System.out.println("Person is getting fresh...");
	}

}
