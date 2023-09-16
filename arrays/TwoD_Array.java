package arrays;

public class TwoD_Array {

	public static void main(String[] args) {
	String [][] arr= {{"M","S","T"},
			{"T","H","U","L","A","S","I"},
			{"M","A","N","I"}};
	System.out.println(arr.length);
	System.out.println(arr[2].length);
	System.out.println(arr[2][1]);
	arr[0][1]="TTT";
	System.out.println(arr[0][1]);
	for(String [] x:arr) {
		for(String y:x) {
			System.out.println(y);
		}
	}
	}
	}


