package com.syntax.class12;

public class PhoneTester {
	public static void main(String[] args) {
		
		/*
		 * if class whose boject we are creating 
		 * is present inside the same package
		 * we dont need to import it.
		 */
		
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="iPhone 14 Pro Max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		
		//new Phone(); -> To create the object
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 Ultra";
		samsung.year=2022;
		samsung.makeCall();
		
		
		
		
	}

}
