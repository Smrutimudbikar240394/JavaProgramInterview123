package stringProgram;

public class reverseString 
{
	public static void main(String[] args) 
	{
		String s="Automation testing";
		String s1=" ";
		char ch;
		System.out.println(s);
		
		for(int i=0;i<=s.length()-1;i++)
		{
			ch=s.charAt(i);
			s1=ch+s1;
		}
		System.out.println(s1);
		
		
		
		
		
	}

}
