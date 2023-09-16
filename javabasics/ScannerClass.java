package javabasics;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string:");
		String str1=sc.nextLine();
		System.out.println(str1);
		String temp="";
		for(int i=0;i<=str1.length()-1;i++) {
			temp=str1.charAt(i)+temp;
		}
		System.out.println("Reverse string is: "+temp);

	}

}
