package com.practicePrograms;

import java.util.Scanner;

public class FibonacciUsingWhileLoop {
	
	public static void main(String[] args) {
		
		int n ;
		int a=0, b=1;
		
		System.out.println("Enter the number n :");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		
		
		System.out.println("Fibonacci Series of :" +n);
		
		
		int i=1;
		while (i<=n) {
			System.out.print(a+"  ");
			int sumOfPrevTwo = a+b;
			a=b;
			b=sumOfPrevTwo;
			i++;
		}
		
	}

}
