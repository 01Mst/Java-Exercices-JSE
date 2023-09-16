package coreJAVA_Exercises;

public class MissingInAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,4,5};
 int sum1=0;
 for(int i=0;i<a.length;i++) {
	 sum1=sum1+a[i];
 }
 int sum2=0;
 for(int i=1;i<=5;i++) {
	 sum2=sum2+i;
 }
 int missing=sum2-sum1;
 System.out.println("The missing element is: "+missing);
	}

}
