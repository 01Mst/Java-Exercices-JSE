package coreJAVA_Exercises;

public class Numberofoddandevendigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23562;
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
 System.out.println(odd_count+" Odd Count");
 System.out.println(even_count+" Even Count");
	}

}
