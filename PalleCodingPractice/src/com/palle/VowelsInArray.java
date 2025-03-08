package com.palle;

public class VowelsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="aeio";
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch!='a'&& ch!='e'&& ch!='i' && ch!='o' && ch!='u') //consonents
			{
				count++;
			}
		}
		System.out.println("COUNT IS :"+ count);

	}

}
