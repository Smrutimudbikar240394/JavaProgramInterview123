package test;

public class MultipleCatch1 
{
	public static void main(String[] args) {
		
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index Out of Bound");
		}
		catch(ArithmeticException arith)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("String Index out of bound");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();	
		}
	}

}
