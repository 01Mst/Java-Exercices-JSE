package coreJAVA_Exercises;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the number of elements: " );
		int []arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int search=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.println("Element found at: "+i);
				flag=true;
				break;
				}
		}
		if(flag==false) {
			System.out.println("Element not found.");
		}
		
	}

}
