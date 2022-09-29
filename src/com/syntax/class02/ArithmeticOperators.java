package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// +,-,*,/,%
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d;
		int div=c/d;
		
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
		System.out.println("remainder is "+remainder);
		System.out.println("division is "+div);
		
		int e=10;
		int f=5;
		
		System.out.println("division = "+e/f); //2
		System.out.println("remainder = "+e%f); //0
		System.out.println(20%7);
		
		double num1=10;
		double num2=3;
		float sum1=10.0F;
		float sum2=3.0F;
		
		System.out.println("division of double "+num1/num2);
		// USE DOUBLE DATA TYPE WHEN DOING DIVISION
		System.out.println("dividion of float "+sum1/sum2);
		
		//remainder - % - mod operator
		System.out.println(4%16);
		System.out.println(10+10/10);
		
		
		
	}

}
