package com.inheritance;

public class PersonFactory {
	public static void main(String[] args) {
		Person person = new Person("Farmaer", 35);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		person.eat();
		person.poop();
		
		Student student = new Student("Rahul Kumar", 26, 123456);
		student.eat();
		
		Person student2 = new Student("Rahul Kumar", 26, 123456);
	}

}
