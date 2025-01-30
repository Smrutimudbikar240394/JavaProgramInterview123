package ExceptionHandling;

public class throwException
{
	public void m1(int age)
	{
		if (age < 18)
		{
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else 
		 {
		      System.out.println("Access granted - You are old enough!");
		 }
	}
	
	
	public static void main(String[] args) 
	{
		throwException te1=new throwException();
		te1.m1(5);
				
		
	}

}
