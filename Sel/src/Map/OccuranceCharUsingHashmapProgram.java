package Map;

import java.util.HashMap;
import java.util.Set;

public class OccuranceCharUsingHashmapProgram 
{
	public static void main(String[] args) 
	{
		String str="abcabcdef";
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
			
		}
		
		Set<Character> allkeys=hm.keySet();
		
		for(Character key1:allkeys)
		{
			System.out.println(key1+"  :  "+hm.get(key1));
			
		}
		
		System.out.println("****duplicate***************");
		for(Character key2:allkeys)
		{
			if(hm.get(key2)>1)
			{
				System.out.println(key2+" : "+hm.get(key2));
			}
		}
		
		
		
	}

}
