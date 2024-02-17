package com.inheritance;

public class Student extends Person{
	
	private int rollNumber;
	
	public Student(String name, int age, int rn) {
		super(name, age);
		this.rollNumber = rn;
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public void study() {
		System.out.println(this.getName() + " is Studying..");
	}
}
