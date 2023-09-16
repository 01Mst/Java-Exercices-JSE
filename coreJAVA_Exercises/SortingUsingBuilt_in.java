package coreJAVA_Exercises;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuilt_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {3,56,7,34,78};
 System.out.println("Array Before Sorting: "+Arrays.toString(a));
 Arrays.parallelSort(a);
 System.out.println("Arrays After Sortng: "+Arrays.toString(a));
 System.out.println("------------------------");
 int b[]= {12,45,7,3,9};
 System.out.println("Arrays Before Sorting: "+Arrays.toString(b));
 Arrays.sort(b);
 System.out.println("Arrays After Sorting: "+Arrays.toString(b));
 System.out.println("----------------------------");
 Integer c[]= {2,7,4,0,9,7};
 System.out.println("Arrays After Sorting: "+Arrays.toString(c));
 Arrays.sort(c,Collections.reverseOrder());
 System.out.println("Arrays after sorting in Decending Order: "+Arrays.toString(c));
	}

}
