package Map;

import java.util.HashMap;
import java.util.Set;

public class test 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(104, "Ramesh");
		hm.put(102, "ganesh");
		hm.put(103,"Suresh");
		hm.put(101, "rahul");
		
		System.out.println(hm);
		
		//size
		System.out.println(hm.size());
		
		//update
		hm.put(103,"SSSS");
		System.out.println(hm);
		
		//get all keys
		
		Set<Integer> allkeys=hm.keySet();
		
		for(Integer k:allkeys)
		{
			System.out.println(k);
		}
		
		//all key and value
		
		for(Integer akv:allkeys)
		{
			System.out.println(akv+"  : "+hm.get(akv));
			
		}
		
		
	}

}
