package com.palle;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=1000;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	
	public static boolean  isPalindrome(int num) {
		int sum=0;
		int temp=num;
		while(num!=0) {
		int rem=num%10;
		 sum=(sum*10)+rem;;
		num=num/10;
		}
		
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
	}

}
