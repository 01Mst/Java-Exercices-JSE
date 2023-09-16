package coreJAVA_Exercises;

public class Regular_Expression_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@!#!@#$%$^%^$&*&& I will clear";
		System.out.println("Before: "+s);
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("After: "+s);
	
		

	}

}
