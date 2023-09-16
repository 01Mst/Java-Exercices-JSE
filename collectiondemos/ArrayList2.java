package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList al=new ArrayList();
 al.add("Hari");
 al.add("Haran");
 al.add("Thulasi");
 al.add("Mani");
 System.out.println(al);
 
 /*ArrayList al_dup=new ArrayList();
 al_dup.addAll(al);
 System.out.println(al_dup); 
 al_dup.removeAll(al);
 System.out.println(al_dup);
 */
 Collections.sort(al);
 System.out.println(al);
 Collections.sort(al,Collections.reverseOrder());
 System.out.println(al);
 Collections.shuffle(al);
 System.out.println(al);
 System.out.println("------------------------");
 String a[]= {"Mst","Thulasimani","Thulasi","Mani"};
 for(String b:a) {
	 System.out.println(b);
 }
 ArrayList al1=new ArrayList(Arrays.asList(a));
 System.out.println(al1);
 
 
	}

}
