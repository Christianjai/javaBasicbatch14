package com.syntax.class07;

public class HomeWork3 {
	
	public static void main(String[] args) {
		
		//3. Print even numbers from 20 to 1 (2 ways)
		
		int i=20;
		
		while(i>=2) {
			System.out.print(i+" ");
			i-=2;
				
			}
		System.out.println("----------");
		
		int ii=20;
		
		while (ii>=2) {
			if (ii%2==0) {
				System.out.print(ii+" ");
			} ii--;
		}
		System.out.println("----------");
		
		// FOR LOOP EXAMPLE
		 for(int iii=20; iii>=1; iii-=2) {
			 System.out.print(iii+" ");
		 }
		
		
	}

}
