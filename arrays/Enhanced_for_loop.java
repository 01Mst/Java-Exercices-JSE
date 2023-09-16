package arrays;
import java.util.Scanner;

public class Enhanced_for_loop {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int [] arr= new int[10];
	for(int i=1;i<=10;i++) {
		arr[i-1]=num1*i;
	}
	for(int n:arr) {
		System.out.println(n);
		
	}

	}

}
