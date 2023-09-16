package arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ListIterator itr=list.listIterator(1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
