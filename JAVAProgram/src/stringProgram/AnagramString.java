package stringProgram;

import java.util.Arrays;

public class AnagramString 
{
	public static void main(String[] args) 
	{

		String s="abc";
		String s1="bca";
		
		if(s.length()==s1.length())
		{
			char[] ar1=s.toCharArray();
			char [] ar2=s1.toCharArray();
			
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			boolean result=Arrays.equals(ar1,ar2);
			
			System.out.println(Arrays.equals(ar1,ar2));
			
			
			if(result)
			{
				System.out.println(" Anagram stringmatch");
			}
			else
			{
				System.out.println("not Anagram string");
			}
			
		
			
			
		}
		
	}

}
