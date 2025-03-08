package com.palle;

import java.util.Arrays;
import java.util.Scanner;

public class biggestElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		System.out.println("eneter array elemnet");
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//maximun arrayElement
		int max=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		int min=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("maximum number in array is"+ max);
		System.out.println("minimum number in array is"+ min);
      		

	}

}
