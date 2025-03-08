package com.bala;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="bala krishna";
		String rev="";
		char c;
		for(int i=0;i<n.length();i++) {
			c=n.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		

	}

}
