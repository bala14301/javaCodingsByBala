package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(33);
		al.add(88);
		System.out.print("List Elmnts are "+al);
		System.out.println();
		
		List<Integer> l=al.stream()
		//.filter(i -> i%2==0)
				.map(i ->i+10)
		.collect(Collectors.toList());
		
		System.out.print(l);

	}

}
