package coreJAVA_Exercises;

public class ReverseEveryWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Folks";
		String[] words=str.split("\\s");
		String reverseWord="";
		for(String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
		}
				System.out.println(reverseWord);

	}

}
