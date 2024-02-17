package com.methodoverride;

public class Farmer extends Person{

	@Override
	public void greet() {
		System.out.println("Hello World, I am a farmer");
	}
}
