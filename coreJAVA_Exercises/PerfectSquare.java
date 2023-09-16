package coreJAVA_Exercises;

public class PerfectSquare {

	public static void main(String[] args) {
		int num=16;
		System.out.println(perfectsquare1(num));
		
	}
		
		    static int perfectsquare1(int num) {
		        long start=1;
		        long end=num;
		        while(start<end){
		           long mid=start+(end-start)/2;
		             if(mid>=num/mid){
		                end=mid;
		            }else{
		                start=mid+1;
		            }
		        }
		        return (int) start;
		        
		        

	}

}
