package com.palle;

public class ArmstromNumber {

	public static void main(String[] args) {
		System.out.println(count(12346777));
		for(int i=1;i<=1000;i++) {
			if(isArmstrong(i)) {
			System.out.print(i+" ");
			}
		}
		// TODO Auto-generated method stub

	}
	
	
	public static boolean isArmstrong(int num) {
		int count=count(num);
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+(int)(Math.pow(rem, count));
			num=num/10;
			
			
		}
		if(temp==sum)
			return true;
		return false;
		
    }
	
	public static int count( int num) {
        int counter=0;
        while(num!=0) {
        	num=num/10;
        	counter++;
        }
        return counter;
	}

}
