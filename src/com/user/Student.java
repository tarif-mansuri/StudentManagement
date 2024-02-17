package com.user;

public class Student {
	
	//member variable
	private String name;
	
	//default constructor
	public Student() {
		
	}
	
	//constructor
	public Student(String myName) {
		this.name = myName;
	}

	//Getter
	public String getName() {
		return name;
	}

	//Setter
	public void setName(String name) {
		this.name = name;
	}	
		
}
