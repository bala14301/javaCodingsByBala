package com.palle;

public class SecondBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,-1};
		int fbig=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fbig) {
				sbig=fbig;
				fbig=arr[i];	
			}else if(arr[i]>sbig && arr[i]!=fbig) {
				sbig=arr[i];
				
			}
		}
		System.out.println("seconf bigest is"+ sbig);
		System.out.println("first bigest is"+ fbig);
	}

}
