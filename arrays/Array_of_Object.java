package arrays;

public class Array_of_Object {

	public static void main(String[] args) {
		Object [][] arr= {{"Mani",33,5.11,'M'},
				{"Girl",30,5.7,'F'},
				{"Thulasi",20,3.4,'G'}};
	for(Object [] x:arr) {
		for(Object y:x) {
			System.out.print(y+" ");
			}
		System.out.print("\n");
		
		
		}
	}}


