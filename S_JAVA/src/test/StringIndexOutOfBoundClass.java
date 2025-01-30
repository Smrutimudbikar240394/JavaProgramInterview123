package test;

public class StringIndexOutOfBoundClass 
{
	public static void main(String[] args) {
		
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(s1.charAt(0));
		}
	}

}
