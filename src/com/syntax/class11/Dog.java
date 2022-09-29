package com.syntax.class11;

public class Dog {
	
	//State
	//Attributes - properties - fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	//These are the behaviours of a dog
	//Medhods/Functions
	void bark() {
		System.out.println("BARK...");
	}
	
	void sleep() {
		System.out.println("sleepy.");
	}
	
	void good() {
		System.out.println("is a good boy");
	}
	
	public static void main(String[] args) {
		
		//creating objects from a class
		//new Dog(); -> it creates an object of class Dog
		Dog dobermann= new Dog();
		dobermann.name="Chompy";
		dobermann.color="red and rust";
		dobermann.breed="dobermann";
		dobermann.age=5;
		System.out.print("At the age of "+dobermann.age+", "+dobermann.name+" is a "+dobermann.color+" "+dobermann.breed+" and "); dobermann.good();
		
		
		
		System.out.println("- - - - - - - - - - - - ");
		
		Dog chihuahua=new Dog();
		chihuahua.name="Moody";
		chihuahua.color="Yellow";
		chihuahua.breed="Chihuahua";
		chihuahua.age=2;
		System.out.print(chihuahua.name+" is a breed of "+chihuahua.breed+" and he loves to "); chihuahua.bark();
		
		
		System.out.println("- - - - - - - - ");
		
		Dog labrador=new Dog();
		labrador.name="Happy";
		labrador.color="Beige";
		labrador.breed="Labrador";
		labrador.age=6;
		System.out.print(labrador.breed+" named "+labrador.name+" is a good boy and really "); labrador.sleep();
		
	
		
		
		
		
		//calling behaviour on an onject
		//dog1.bark();
		//dog1.sleep();
		
	}

}
