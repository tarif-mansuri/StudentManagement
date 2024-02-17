package com.user;

public class StudentFactory {
	
	public static void main(String[] arr){
		//Object creation
		Student s = new Student();		
		System.out.println(s.getName());
		//Object initialization
		s.setName("Madhulika");
		System.out.println(s.getName());
		
		Student s2 = new Student("Mayawati");
		
		System.out.println(s2.getName());
	}

}
