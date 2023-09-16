package coreJAVA_Exercises;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java Programming";
		int totalcount=a.length();
		int totalcountafterremove=a.replace("a", "").length();
		int count=totalcount-totalcountafterremove;
		System.out.println(count);



	}

}
