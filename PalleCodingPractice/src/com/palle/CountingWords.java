package com.palle;

public class CountingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="palle technology one of the good";
		int count=1;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(" number of words"+count);

	}

}
