package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Thulasimani");
		al.add(34);
		al.add("Hariharan");
		System.out.println(al);
		al.remove("Thulasimani");
		System.out.println(al);
		al.add(1, "Thulasimani");
		al.add(3,100);
		System.out.println(al.get(1));
		System.out.println(al);
		al.set(2, 100000);
		System.out.println(al);
		System.out.println(al.contains(100));
		System.out.println(al.isEmpty());
		//for loop
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
			//for each loop
			System.out.println("Reading elements by using for each loop:");
			for(Object e:al) {
				System.out.println(e);
			}
			//Iterator
			System.out.println("Reading elements by using Iterator");
			Iterator it=al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}

}
