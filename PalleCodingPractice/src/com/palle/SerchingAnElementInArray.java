package com.palle;

public class SerchingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,8,6,55,5};
		int po=-1;
		int target=99;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				po=i;
				break;
			}
		}
		
		if(po==-1) {
			System.out.println(target+ "not found in array");
		}else
		 {
			System.out.println(target+ " found in array at"+po+" index");
			
		}

	}

}
