package com.arr;

public class CarFactory {
	public static void main(String[] args) {
		
		
		
		Car car1 = new Car();
				
		Car car2 = new Car();
		
		//System.out.println(car1.getName());
		
		
		
		Car[] myCars = new Car[2];
		myCars[0] = car1;
		myCars[1] = car2;
		
		for(int i=0;i<2;i++) {
			myCars[i].setName("Maruti Suzuki" + i);
			myCars[i].setChasisNumber(100*(i+1));
			myCars[i].setGear(4+i);
		}
		
		System.out.println(car1.getName());
		
//		for(int i=0; i<2; i++) {
//			System.out.print(myCars[i].getName() +" ");
//			System.out.print(myCars[i].getChasisNumber() +" ");
//			System.out.print(myCars[i].getGear() +" ");
//			System.out.println();
//		}
	}

}
