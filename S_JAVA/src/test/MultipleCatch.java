package test;

public class MultipleCatch 
{
	public static void main(String[] args) {
		
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Array Index Out Of Bounds Exception  handled ");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception e");
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("String Index Out Of bound");
		}
	}

}
