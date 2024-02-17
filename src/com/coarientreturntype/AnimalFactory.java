package com.coarientreturntype;

public class AnimalFactory {
	public static void main(String[] args) {
		
		Animal myAnimal = getAnimal();
		System.out.println(myAnimal.eat());
		
		Dog dog= getDog();
		System.out.println(dog.eat());
		
		Animal dog2= getDog();
		System.out.println(dog2.eat());
		
		Animal myPet = getMyFavoriteAnimal(false);
		System.out.println(myPet.eat());
		
	}
	
	//returns reference of Animal type
	public static Animal getAnimal() {
		Animal a = new Animal();
		return a;
	}
	
	//returns reference of Dog type
	public static Dog getDog() {
		Dog dog = new Dog();
		return dog;
	}
	
	//returns reference of Cat type
	public Cat getCat() {
		Cat cat = new Cat();
		return cat;
	}
	
	//Covarient return type =>> if a function returns X type reference then it can also return X's child type reference.
	//this concept is known as Co-varient return type
	public static Animal getMyFavoriteAnimal(boolean isCat) {
		if(isCat == true) {
			Cat cat = new Cat();
			return cat;
		}else {
			Dog dog = new Dog();
			return dog;
		}
	}
	
	

}
