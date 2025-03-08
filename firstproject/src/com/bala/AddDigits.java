package com.bala;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=65,rem,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);
		

	}

}
