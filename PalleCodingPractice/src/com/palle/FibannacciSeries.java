package com.palle;

public class FibannacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int num=20,sum;
		System.out.print(a+" ");
		System.out.print(b+" "); 
		for(int i=2;i<num;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
			
		}

	}
	
	

}
