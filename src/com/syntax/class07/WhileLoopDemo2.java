package com.syntax.class07;

public class WhileLoopDemo2 {
	
	public static void main(String[] args) {
		
		//print all numbers from 1 to 10
		
		int num=1;
		
		while (num<=10) {
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println("____________");
		
		//print all number from 10 to 25
		
		int num1=10;
		
		while (num1<=25) {
			System.out.print(num1+" ");
			num1++;
		}
		
		System.out.println("____________");
		
		
		// print all numbers from 10 to 1
		
		int a=10;
		
		while (a>=1) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println("_____________");
		
		//print all numbers from 50 to 20
		
		//print all even number 1 to 20
		
		int all=50;
		
		while (all>=20) {
			System.out.println(all+" ");
			all--;
		}
		
		
		int even=2;
		
		while (even<=20) {
			
				System.out.println(even);
				even+=2;
			}
		System.out.println("Another way");
		
		int e=1;
		
		while (e<=20) {
			if (e%2==0) {
				System.out.print(e+" ");
			} e++;
		}
			
			
		}
		
	}



