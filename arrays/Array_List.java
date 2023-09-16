package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> arr=new ArrayList<String>();
    arr.add("Red");
    arr.add("Blue");
    arr.add("Green");
    System.out.println(arr);
    System.out.println(arr.get(0));
    arr.set(2, "Brown");
    System.out.println(arr);
    //arr.clear();
   arr.remove(0);
   System.out.println(arr);
   System.out.println(arr.indexOf("Brown"));
   arr.add("Brown");
   System.out.println(arr.indexOf("Brown"));
   System.out.println(arr.lastIndexOf("Brown"));
   System.out.println("List Elements: "+arr);
   System.out.println(arr.contains("White"));
   System.out.println("-------------------");
   LinkedList<Double> list=new LinkedList<Double>();
   System.out.println("LINKED LIST:");
   list.add(1.1);
   list.add(1.2);
   list.add(1.3);
   list.add(1.4);
   System.out.println(list);
   System.out.println("-------------------");
   List<Double> l= new ArrayList<Double>();
   List<Integer> a=new ArrayList<Integer>();
   
   
	}

}
