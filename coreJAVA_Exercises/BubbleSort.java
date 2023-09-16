package coreJAVA_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array before Sorting: "+Arrays.toString(a));
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
		for(int j=0;j<len-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}}
		}
		System.out.println("Array after Sorting: "+Arrays.toString(a));
		}

}
