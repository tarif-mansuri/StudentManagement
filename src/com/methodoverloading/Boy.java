package com.methodoverloading;

public class Boy {
	private String name;
	
	public void sing() {
		System.out.println("Singing a bhajan...");
	}
	
	public void sing(int age) {
		System.out.println("Singing a Rap song...");
	}
	
	public void sing(String friend) {
		System.out.println("Singing a Friendship song...");
	}
	
	public void sing(String friend, int age) {
		System.out.println("Singing a Friendship song...");
	}

}
