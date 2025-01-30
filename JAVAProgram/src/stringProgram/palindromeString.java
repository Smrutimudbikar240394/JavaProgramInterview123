package stringProgram;

public class palindromeString 
{
	public static void main(String[] args) 
	{
		String s="radar";
		String r=new StringBuilder(s).reverse().toString();
		
		if(s.equals(r))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}

}
