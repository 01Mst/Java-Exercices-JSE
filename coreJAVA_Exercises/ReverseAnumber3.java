package coreJAVA_Exercises;

import java.util.Scanner;

public class ReverseAnumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("The Reversed number is: "+rev);
		
	}

}
