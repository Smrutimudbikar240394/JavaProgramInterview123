package StringProgram;

public class RemoveDigitFromString 
{
	public static void main(String[] args)
	{
		String str="5abcd45hgfr67";
		String str1=" ";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(!Character.isDigit(ch))
			{
				str1=str1+ch;
			}
			
			
		}
		System.out.println(str1);
		
	}

}
