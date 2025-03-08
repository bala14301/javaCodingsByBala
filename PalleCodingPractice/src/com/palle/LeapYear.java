package com.palle;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkleap(2024));
		for(int i=1;i<2025;i++) {
			if(checkleap(i)) {
				System.out.print(i+" ");
			}
		}
		

	}
	
	public static boolean checkleap(int year) {
    if((year%4==0 && year%100!=0) || (year%400==0)) {
    	return true;	
		}else {
			return false;
		}
	}

}
