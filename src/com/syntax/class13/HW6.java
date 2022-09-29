package com.syntax.class13;

public class HW6 {
	
	public static void main(String[] args) {
		
		// How would you swap  2 strings without a temporary variable?
		
		String a="Good";
		String b="Morning";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
