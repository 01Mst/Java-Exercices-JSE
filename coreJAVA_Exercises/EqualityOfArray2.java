package coreJAVA_Exercises;

import java.util.Scanner;

public class EqualityOfArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean status=true;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the length of the array: ");
    int size=sc.nextInt();
    int[] a1=new int[size];
    int[] a2=new int[size];
    System.out.println("Enter the number of elements in the first Array: " );
    for(int i=0;i<size;i++) {
    	a1[i]=sc.nextInt();
    }
    System.out.println("Enter the number of the elements in the second array: ");
    for(int i=0;i<size;i++) {
    	a2[i]=sc.nextInt();
    }
    if(a1.length==a2.length) {
    	for(int i=0;i<a1.length;i++) {
    		if(a1[i]!=a2[i]) {
    			status=false;
    		}
    	}}
    	else {
    		status=false;
    		
    	}
    	if(status==true) {
    		System.out.println("Arrays are Equal.");
    	}else {
    		System.out.println("Arrays are Not Equal.");
    	}
    }
	}
