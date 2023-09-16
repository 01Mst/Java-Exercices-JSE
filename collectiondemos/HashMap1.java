package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap m=new HashMap();
		HashMap<Integer, String> m=new HashMap();
		m.put(1, "Mst");
		m.put(2, "Thulasi");
		m.put(3, "Mani");
		m.put(4, "Engineer");
		System.out.println(m);
	/*	System.out.println(m.get(4));
		m.remove(1);
		System.out.println(m);
		System.out.println(m.containsKey(109));
		System.out.println(m.containsValue("Cricketer"));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());*/
		for(Object e:m.keySet()) {
			System.out.println(e);
			
		}
		for(Object f:m.values()) {
			System.out.println(f);
		}
		for(Object g:m.keySet()) {
			System.out.println(g+" "+m.get(g));
		}
		System.out.println("-------------------");
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("-------------------");
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println();
			Map.Entry q=(Entry) itr.next();
			System.out.println(q.getKey()+" "+q.getValue());
			
		}
		

	}

}
