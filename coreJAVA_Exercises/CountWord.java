package coreJAVA_Exercises;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of words in the sentence are: "+count);
	}

}
