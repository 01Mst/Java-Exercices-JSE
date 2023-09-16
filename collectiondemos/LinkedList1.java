package collectiondemos;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(1);
		l.add(90);
		l.addFirst(100);
		l.addLast(1000);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println(l.size());
		System.out.println("----------------");
		
		/*Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using addAll(): ");
		LinkedList nl=new LinkedList();
		nl.addAll(l);
		System.out.println(nl);
		nl.removeAll(l);
		System.out.println(nl);
		//sort
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);*/
		 
	}

}
