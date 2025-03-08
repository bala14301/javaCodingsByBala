package com.palle;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="madam";
		String reverse="";
		int len=name.length();
		for(int i=len-1;i>=0;i-- ) {
			reverse=reverse+name.charAt(i);
		}
		
		if(reverse.equals(name)) {
			System.out.println("palindrom");
		}else {
			System.out.println(" Not palindrom");
		}

	}

}
