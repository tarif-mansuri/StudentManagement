package com.methodoverride;

public class Teacher extends Person{
	@Override
	public void greet() {
		System.out.println("Hello World, I am a Teacher");
	}

}
