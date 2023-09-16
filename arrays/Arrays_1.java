package arrays;

public class Arrays_1 {
	public static void main(String args[]) {
		String [] DaysofWeek= {"Mon","Tue","Wed","Thurs","Fri","Sat","Sun"};
		System.out.println(DaysofWeek.length);
		System.out.println(DaysofWeek[3]);
		DaysofWeek[4]="T67";
		System.out.println(DaysofWeek[4]);
		for(int i=0;i<=DaysofWeek.length-1;i++) {
			System.out.println(DaysofWeek[i]);
		}
	}

}
