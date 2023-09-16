package collectiondemos;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(1,"aa");
		ht.put(2, "bb");
		ht.put(3, "cc");
	//	ht.put(3, null);
		//ht.put(null,"dd" );
		System.out.println(ht);
		
		for(Map.Entry m:ht.entrySet()) {
	}

}
