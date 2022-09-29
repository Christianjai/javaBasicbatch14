package com.syntax.class10;

public class Testiiiii {
	public static void main(String[] args) {
		
		 int a = 5;

	        boolean isPrime = false;
	        for (int i = 2; i <= a - 1; i++) {
	            if (a % i == 0) {
	               isPrime = true;
	            }
	        }
	        if (isPrime) {
	            System.out.println("Isn't prime");
	        } else {
	            System.out.println("Is Prime");       }
	    }
	
	}


