package test;

public class ArithmeticExceptionClass 
{
	public static void main(String[] args) {
		
		int i=10;
		int j=0;
		int k=0;
		System.out.println("Before Exception");
		
		//int k=i/j;
		//System.out.println("After exception");
		//System.out.println(k);
		
		try
		{
			k=i/j;
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println(ae);
		}
		System.out.println(k);
		
	}

}
