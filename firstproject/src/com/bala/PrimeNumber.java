package com.bala;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  int n=9; int flag=0; if(n==0 || n==1) { System.err.println("not a prime"); }
//		  else { for(int i=2;i<=(n/2);i++) { if(n%i==0) {
//		  
//		  System.out.println("not a prime"); flag=1; break; }
//		  
//		  } if(flag==0) { System.out.println("prime"); } }
		//System.out.println(PrimeNumber.checkprime(4));
		for(int i=0;i<100;i++) {
			if(PrimeNumber.checkprime(i)) {
				System.out.print(i+",");
			}
		}
		 

		

	}

	  public static boolean  checkprime(int n) {
		  
	  
	  int flag=0;
	  if(n==0 || n==1) 
		  return false;
		  
	  else { 
		  for(int i=2;i<=n/2;i++) {
	            if(n%i==0) {
	            	flag=1; 
	            	return false; 
	            	}
	            }
		  
		  if(flag==0) 
			  return true;
		  return false;
	  
	  }
	 
	  }
	 
	  
	  
	 
	 

}
