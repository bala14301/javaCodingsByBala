package com.palle;

import java.util.Arrays;

public class ReversingWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="palle technology and sciences";
		String[] arr=name.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			String element=arr[i];
			for(int j=element.length()-1;j>=0;j--) {
				System.out.print(element.charAt(j));	
			}
			System.out.print(" ");
			
		}

	}

}
