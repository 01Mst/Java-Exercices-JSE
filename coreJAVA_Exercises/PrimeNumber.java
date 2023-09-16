package coreJAVA_Exercises;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num=sc.nextInt();
      int count=0;
      if(num>1) {
    	  for(int i=1;i<=num;i++) {
    		  if(num%i==0) {
    			  count++;
    		  }}
    		  if(count==2) {
    			  System.out.println(num+ " is a Prime Number.");
    		  }
    		  else {
    			  System.out.println(num+ " is not a Prime Number.");
    		  }
    	  }
      }
	}


