package com.syntax.class11;

public class Phone {
	
	String make;
	String model;
	String color;
	String camera;
	int storage;
	double size;
	boolean cheap;
	
	void call() {
		System.out.println(make+" calling");
	}
	
	void takePictures() {
		System.out.println("Taking pictures");
	}
	
	public static void main(String[] args) {
		
		//name of class variable name = new Name of class ();
		Phone iPhone=new Phone();
		iPhone.make="Apple";
		iPhone.model="iPhone 14 Pro Max";
		iPhone.color="Black";
		iPhone.storage=123;
		iPhone.size=6.8;
		iPhone.cheap=false;
		
		System.out.println("Make "+iPhone.make+" Model "+iPhone.model);
		iPhone.call();
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
		
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.color="Grey";
		samsung.storage=156;
		samsung.size=6.7;
		samsung.cheap=false;
		
		System.out.println(iPhone.make);
		System.out.println(samsung.make);
		
		Phone pixel=new Phone();
		pixel.make="Google";
		pixel.model="6";
		pixel.color="red";
		pixel.storage=123;
		pixel.size=6.5;
		pixel.cheap=true;
		
		System.out.println("New "+pixel.make+" pixel "+pixel.model+" is available in "+pixel.color+" color" );
		
		
		
			
	}

}
