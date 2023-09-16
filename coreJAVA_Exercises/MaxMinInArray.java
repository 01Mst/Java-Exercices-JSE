package coreJAVA_Exercises;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array: ");
     int size=sc.nextInt();
     System.out.println("Enter the elements of the array: ");
     int[] a=new int[size];
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();
     }
     int max=a[0];
     int min=a[0];
     for(int i=1;i<a.length;i++) {
    	if(a[i]>max) {
    		max=a[i];}}
    		System.out.println("Maximum element in the array is: "+max);
    	
     
     for(int i=1;i<a.length;i++) {
    	 if(a[i]<min) {
    		 min=a[i];
    	 }}
    		 System.out.println("Minimum element in the array is: "+min);
    	 
     
	}

}
