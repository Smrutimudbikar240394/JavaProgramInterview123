package ExceptionHandling;

public class sample12 
{
	public static void main(String[] args) 
	{
		String[] ar= {"mahesh","ramesh","suresh"};
		try
		{
			System.out.println(ar[8]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("   **");
		}
		
	}

}
