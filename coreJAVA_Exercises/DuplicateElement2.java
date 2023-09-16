package coreJAVA_Exercises;

import java.util.HashSet;

public class DuplicateElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		HashSet <String>langs=new HashSet();
		/*System.out.println(langs.add("java"));
		System.out.println(langs.add("java"));
		System.out.println(langs.add("python"));
*/
		String a[]= {"java","c","python"};
		for(String l:a) {
			if(langs.add(l)==false) {
			System.out.println("Found Duplicate Element: "+l);
			flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Duplicate Element.");
		}
	}
}
