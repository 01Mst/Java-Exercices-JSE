package coreJAVA_Exercises;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("Enter the third number: ");
		int c=sc.nextInt();
		/*if(a>b && a>c) {
			System.out.println(a+ " is the largest number.");
		}
		else if(b>a && b>c) {
			System.out.println(b+ " is the largest number.");
		}
		else {
			System.out.println(c+" is the largest number");
		}
		int largest1=a>b?a:b;
		int largest=c>largest1?c:largest1;
		System.out.println(largest+" is the Largest Number.");
		*/
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+" is the Largest Number.");
		

	}

}
