package coreJAVA_Exercises;

import java.util.Scanner;

public class ReverseAString3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("The Revesed String is: "+sb);

	}

}
