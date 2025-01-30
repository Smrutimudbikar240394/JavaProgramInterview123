package Map;

import java.util.TreeMap;

public class TreeMap_Example 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(104, "Ramesh");
		tm.put(102, "ganesh");
		tm.put(103,"Suresh");
		tm.put(101, "rahul");
		
		System.out.println(tm);
		
	}

}
