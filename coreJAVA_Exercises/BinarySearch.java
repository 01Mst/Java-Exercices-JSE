package coreJAVA_Exercises;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int a[]= {1,2,3,4,5};
		int key=10;
		int l=0;
		int h=a.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==key) {
				System.out.println("Element Found.");
				flag=true;
				break;
			}
			if(a[m]>key) {
				h=m-1;
			}
			if(a[m]<key) {
				l=m+1;
			}
		
		}
		if(flag==false) {
			System.out.println("Element not found.");
		}
	}

}
