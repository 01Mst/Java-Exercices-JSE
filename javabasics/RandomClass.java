package javabasics;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random r1=new Random();
		for(int i=1;i<=100;i++) {
		System.out.println(r1.nextInt(10)+10);
		}
		
			for(int i=1;i<=100;i++) {
				System.out.println((int)(Math.random()*100)+1000);
			}
		}
		

	}

