package coreJAVA_Exercises;
import java.util.*;

public class ASCII {

	public static void main(String[] args) {
	
		char ch;
		System.out.println("Enter any Character:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int ascii=ch;
		System.out.println("ASCII Value for "+ch+" is: "+ascii);

	}

}
