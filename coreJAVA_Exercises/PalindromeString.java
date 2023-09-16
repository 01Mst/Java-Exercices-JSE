package coreJAVA_Exercises;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		String org=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println(org+" Palindrome");
		}
		else {
			System.out.println(org+" Not Palindrome");
		}
	}

}
