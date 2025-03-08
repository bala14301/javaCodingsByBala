package com.palle;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=-0;i<100;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
		

	}
	
	public  static boolean checkPrime(int num) {
		boolean isprime=true;
		if(num==1 || num==0) {
			isprime=false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			return true;
		}else {
		return false;
	}

}
}
