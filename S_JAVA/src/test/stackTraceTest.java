package test;

public class stackTraceTest 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch (Exception b) 
		{
			b.printStackTrace();
			System.out.println("generic exception handled");	
			
		}
		
		
	}

}
