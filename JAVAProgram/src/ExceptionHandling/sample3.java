package ExceptionHandling;

public class sample3 
{
	public static void main(String[] args) 
	{
		String s="smruti";
		try
		{
			System.out.println(s.charAt(9));
		}
		catch (StringIndexOutOfBoundsException se) {
			System.out.println("String Index out of bound exception occured");
		}
		
	}

}
