package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ex1_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("abc");     //0
		a1.add(101);       //1
		a1.add(65.6f);     //2
		a1.add('A');       //3
		a1.add(null);      //4
		
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		System.out.println(a1.size());
		
		
		
		
	}

}
