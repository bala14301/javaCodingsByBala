package com.palle;

import java.util.Arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,8,10,8,55,8};
		int [] rem=Arrays.stream(arr).distinct().toArray();
		
		System.out.println(Arrays.toString(rem));
				

	}

}
