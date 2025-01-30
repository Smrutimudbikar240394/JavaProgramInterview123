package test;

public class ArrayIndexOutOfBoundClass
{
	public static void main(String[] args) 
	{
		
		String[] ar= {"abc","xyz","pqr","lmn"};
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println(ar[5]);
			
		}
	}

}
