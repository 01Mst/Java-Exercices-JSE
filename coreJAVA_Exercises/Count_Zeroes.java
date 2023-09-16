package coreJAVA_Exercises;

public class Count_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2020230450;
		int count=0;
		while(num>0) {
		int rev=num%10;
		if(rev==0) {
			count++;
			
		}
		num=num/10;
			
		}
		System.out.println(count);

	}

}
