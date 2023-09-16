package coreJAVA_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the number of array elements: ");
		size=sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Elements of the array are: "+Arrays.toString(arr));
		
         System.out.println("Sum of Array Elements: "+sum);
	}

}
