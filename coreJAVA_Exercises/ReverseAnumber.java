package coreJAVA_Exercises;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
System.out.println("The Reversed Number is: "+rev);
	}

}
