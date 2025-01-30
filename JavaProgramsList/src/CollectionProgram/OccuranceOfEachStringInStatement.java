package CollectionProgram;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfEachStringInStatement 
{
	public static void main(String[] args) 
	{
		String str="my name is abc is abc is";
		String [] ar=str.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		
		for(int i=0;i<ar.length-1;i++)
		{
			String s1=ar[i];
			
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
			{
				hm.put(s1, 1);
			}
			
		}

		Set<String> allkeys=hm.keySet();
		
		for(String key:allkeys)
		{
			if(hm.get(key)>1)
			{
				System.out.println(key+"-"+hm.get(key));
			}
		}
	}

}
