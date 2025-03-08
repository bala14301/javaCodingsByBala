package com.palle;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("fact is"+fact);

	}

}
