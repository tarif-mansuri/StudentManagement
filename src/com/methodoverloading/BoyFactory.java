package com.methodoverloading;

public class BoyFactory {
	public static void main(String[] args) {
		Boy b1 = new Boy();
		b1.sing();
		b1.sing(12345);
		b1.sing("Caterina");
		b1.sing("Anamika", 20);
	}

}
