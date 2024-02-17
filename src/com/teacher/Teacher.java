package com.teacher;

public class Teacher {
	private String name;
	private static String collegeName;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void setCollegeName(String cName) {
		collegeName = cName;
	}
	
	public static String getCollegeName() {
		return collegeName;
	}
	
}
