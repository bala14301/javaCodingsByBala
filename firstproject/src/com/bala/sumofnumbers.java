package com.bala;

import java.util.Scanner;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,sum=0;
		System.out.println("enter number1");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("enter number2");
		n2=sc.nextInt();
		sum=n1+n2;
		float average=(float)sum/2;
		System.out.println(sum);
		System.out.println("average"+average);

	}

}
