package Map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Ganesh");
		hm.put(102,"Suresh");
		hm.put(104,"Rajesh");
		hm.put(105,"Dinesh");
		hm.put(103,"Ramesh");
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey(103));
		System.out.println(hm.put(108,"SSSS"));
		System.out.println(hm);
		
		
		Set<Integer> allkeys=hm.keySet();
		
		//get all keys
		for(Integer key:allkeys)
		{
			System.out.println(key);
		}
		
		//get all keys and values
		for(Integer key:allkeys)
		{
			System.out.println(key+" :  "+hm.get(key));
		}
		
		
		hm.put(108,"Ganesh");
		
		for(Integer key:allkeys)
		{
			System.out.println(key+" :  "+hm.get(key));
		}
		
		
		
		
		
		
	}

}
