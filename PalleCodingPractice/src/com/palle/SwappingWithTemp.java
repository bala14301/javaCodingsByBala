package com.palle;

import java.util.Scanner;

public class SwappingWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a value");
		int a=sc.nextInt();
		System.out.println("eneter b value");
		int b=sc.nextInt();
	   int temp=0;
	   temp=a;a=b;b=temp;
	   System.out.println(a);
	   System.out.println(b);
	   

	}

}
