package com.lamda;

public class LamdaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator name=()->System.out.println("bala");
		name.display();
		IC add=(a,b)->a+b;
		int result=add.operations(22, 56);
		System.out.println(result);

	}

}
interface ICalculator{
	void display();
}

interface IC{
	int operations(int a,int b);
}
