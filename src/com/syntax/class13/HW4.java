package com.syntax.class13;

public class HW4 {
	
	public static void main(String[] args) {
		
		//How would you reverse a String word by word? for example
        //input=>This is sentence i want to reverse
        //output=>sihT si ecnetnes i tnaw ot esrever
		
		String str="This is sentence i want to reverse";
		String[] a=str.split(" ");
		String reverseS="";
		
		for (String words:a) {
		String reverse="";
			for (int i=words.length()-1; i>=0; i--) {
				reverse=reverseS+words.charAt(i);
			}
				reverseS=reverseS+reverse+" ";
				
			}
			System.out.print(reverseS);
		}
	

}

