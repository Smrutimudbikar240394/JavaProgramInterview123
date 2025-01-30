package Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashmapProgram 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		
		lhm.put(101, null);
		lhm.put(null,"ZZZZ");
		lhm.put(null, null);
		lhm.put(105,"ZAAA");
		lhm.put(106,"dfvgfdf");
		
		System.out.println(lhm);
		
		Set<Integer> s1=lhm.keySet();
		for(Integer keys:s1)
		{
			System.out.println(keys+" : "+lhm.get(keys));
		}
		
	}

}
