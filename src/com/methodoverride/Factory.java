package com.methodoverride;

public class Factory {
	public static void main(String[] args) {
		Person[] personArray = new Person[4];
		
		personArray[0] = new Student();
		personArray[1] = new Teacher();
		personArray[2] = new Farmer();
		personArray[3] = new Person();
		
		for(int i=0; i<4; i++) {
			personArray[i].greet();
		}
	}

}
