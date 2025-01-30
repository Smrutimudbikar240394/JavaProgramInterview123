package Map;

import java.util.HashMap;
import java.util.Hashtable;

public class Diiference_Of_HashMap_HashTable 
{
	public static void main(String[] args) {
		
	/*	Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(105, "suresh");
		ht.put(103, "Akash");
		ht.put(102, "Rahul");
		ht.put(101,"ganesh");
		ht.put(102,"mahesh");
		ht.put(null, "smruti");
		ht.put(null,"shruti");
		ht.put(104, null);
		
		System.out.println(ht);
	*/	
		
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(104, "Ramesh");
		hm.put(102, "ganesh");
		hm.put(103,"Suresh");
		hm.put(101, "rahul");
		hm.put(null, "smruti");
		hm.put(null,"shruti");
		hm.put(105, null);
		
		System.out.println(hm);
		
	}

}
