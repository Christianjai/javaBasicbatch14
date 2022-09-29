package com.syntax.class11;

public class Student {
	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzaaa..");
	}
	
	public static void main(String[] args) {
		
		//new Student() -> creates and object of Student class
 		Student christianObject=new Student();
 		christianObject.name="Christian";
 		christianObject.id="123";
 		christianObject.age=31;
 		christianObject.weight=78;
 		
 		System.out.println(christianObject.name);
 		System.out.println(christianObject.age);
 		//a way to print out the "void" part behaviour
 		christianObject.deleteMessages();
 		
 		System.out.println("- - - - - - - - - - - - - - ");
 		
 		Student student2=new Student();
 		student2.name="Asma";
 		student2.age=16;
 		student2.weight=30;
 		student2.gender='F';
 		System.out.println(student2.name);
 		student2.eat();
 		
 		
 		
		
	}
	

}
