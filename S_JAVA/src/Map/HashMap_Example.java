package Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Example
{
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(104, "Ramesh");
		hm.put(102, "ganesh");
		hm.put(103,"Suresh");
		hm.put(101, "rahul");
		
		System.out.println(hm);
		
		//Size og hashmap
		System.out.println(hm.size());
		
		//show value or get value from hashmap

		System.out.println(hm.get(101));
		
		
		//get all keys
		
		Set<Integer> allkeys=hm.keySet();
		for(Integer ak:allkeys)
		{
			System.out.println(ak);
		}
		
		
		//get all key and value
		
		for(Integer akv:allkeys)
		{
			System.out.println(akv+" : "+hm.get(akv));
		}
	}

}
