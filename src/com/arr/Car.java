package com.arr;

public class Car {
	private String name;
	private int engineNumber;
	private int gear;

	public Car() {
		
	}
	
	public Car(String cName) {
		this.name = cName;
	}
	
	public Car(String name, int chasisNumber, int gear) {
		this.name = name;
		this.engineNumber = chasisNumber;
		this.gear = gear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChasisNumber() {
		return engineNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.engineNumber = chasisNumber;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void printGear() {
		System.out.println(this.getGear());
	}

}
