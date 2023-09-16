package javabasics;

public class Stringclass {

	public static void main(String[] args) {
	
		String str1="Mst";
		str1=str1+" in";
		str1=str1+" progress";
		
		System.out.println(str1);
		StringBuilder sb1=new StringBuilder("Mst");
		sb1.append(" in");
		sb1.append(" progress");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Learning is Fun");
		sb2.insert(9,"Java ");
		System.out.println(sb2);
		sb2.replace(9,13,"Everything");
		System.out.println(sb2);
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		
		System.out.println(str1.replace("Mst","Thulasimani"));
		str1=str1.replace("Mst","Thulasimani");
		System.out.println(str1);
		
		sb2.delete(1, 5);
		System.out.println(sb2);
		
		sb1.reverse();
		System.out.println(sb1);
	
		
	}

}
