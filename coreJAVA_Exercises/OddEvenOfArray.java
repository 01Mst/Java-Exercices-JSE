package coreJAVA_Exercises;

import java.util.Scanner;

public class OddEvenOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int even_count=0,odd_count=0;
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				even_count++;
			}else {
				odd_count++;
				}}
			System.out.println("Number of even elements in the array are: "+even_count);
			System.out.println("Number of odd elements in the array are: "+odd_count);
		}
	}


