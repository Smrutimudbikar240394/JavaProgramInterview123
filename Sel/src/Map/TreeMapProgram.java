package Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(105,"ZSSS");
		tm.put(104,"PPP");
		//tm.put(101, null);
		//tm.put(null,"KKKK");
		tm.put(110,"AASS");
		tm.put(103, "AAAA");
		
		Set<Integer> s1=tm.keySet();
		
		for(Integer k1:s1)
		{
			System.out.println(k1+" :  "+tm.get(k1));
		}
	}

}
