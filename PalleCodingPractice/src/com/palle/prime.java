package com.palle;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int num=11;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("primr");
		}else {
			System.out.println(" not primr");
			
		}

	}

}
