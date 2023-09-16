package coreJAVA_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrays: ");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		System.out.println("Enter the elements of first array: " );
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array: ");
		for(int i=0;i<size;i++) {
			arr2[i]=sc.nextInt();
		}
		boolean status=Arrays.equals(arr1, arr2);
		if(status==true) {
			System.out.println("Arrays are equal.");
		}else {
			System.out.println("Arrays are not equal.");
		}
		
	}

}
