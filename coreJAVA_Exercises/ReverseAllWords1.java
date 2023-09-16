package coreJAVA_Exercises;

public class ReverseAllWords1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Honesty is the best policy.";
		String[] words=str.split(" ");
		String reverseString="";
		for(String w:words) {
			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
System.out.println(reverseString);
	}

}
