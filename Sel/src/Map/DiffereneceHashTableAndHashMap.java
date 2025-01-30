package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class DiffereneceHashTableAndHashMap 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(101,"Swaraj");
		//ht.put(null, null);
		//ht.put(103, null);
		//ht.put(null,"Sneha");
		
		Set<Integer> s1=ht.keySet();
		for(Integer key1:s1)
		{
			System.out.println(key1+ "  :  "+ht.get(key1));
			
		}
		
		
		
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(201,"Sejal");
		hm.put(null, null);
		hm.put(203, null);
		hm.put(null,"anu");
		
		
		Set<Integer> mapkey=hm.keySet();
		
		for(Integer mk:mapkey)
		{
			System.out.println(mk+"  : "+hm.get(mk));
		}
		
		
		
		
	}
	

}
