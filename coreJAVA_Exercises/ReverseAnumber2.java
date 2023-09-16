package coreJAVA_Exercises;

import java.util.Scanner;

public class ReverseAnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number: ");
int num=sc.nextInt();
StringBuffer rev;
StringBuffer sb=new StringBuffer(String.valueOf(num));
rev=sb.reverse();
System.out.println("The Reversed Numbet is:"+rev);

	}

}
