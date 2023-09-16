package arrays;

import java.util.LinkedList;
import java.util.List;


public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Double> list=new LinkedList<Double>();
 list.add(1.1);
 list.add(1.2);
 list.add(1.3);
 list.add(1.4);
 System.out.println(list);
 System.out.println(list.peekFirst());
 System.out.println(list.peekLast());
 System.out.println(list);
 System.out.println("-------------");
 System.out.println(list.pollFirst());
 System.out.println(list.pollLast());
 System.out.println(list);
	}

}
