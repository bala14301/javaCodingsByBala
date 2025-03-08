package com.bala;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20, n1=0,n2=1,next;
		for(int i=0;i<20;i++) {
			System.out.print(n1+",");
			next=n1+n2;
			n1=n2;
			n2=next;
			
			
		}

	}

}
