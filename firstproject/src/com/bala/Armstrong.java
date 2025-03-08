package com.bala;

public class Armstrong {

	public static void main(String[] args) {
		for(int i=1;i<300;i++) {
		if(Armstrong.isarmstrong(i)) {
			System.out.print(i+",");
		}
		}
		//System.out.println(isarmstrong(13));
		// TODO Auto-generated method stub

	}
	static boolean isarmstrong(int n) {
		int temp=n ,digits=0;
		
		while(temp>0) {
			temp=temp/10;
			digits++;
			
		}
		temp=n; int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=(int)(sum+Math.pow(rem, digits));
			temp=temp/10;
			
		}
		if(n==sum) {
			return true;
		}
		return false;
	}

}
