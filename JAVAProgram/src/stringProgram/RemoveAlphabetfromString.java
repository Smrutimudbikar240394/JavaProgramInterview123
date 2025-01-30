package stringProgram;

public class RemoveAlphabetfromString
{
	public static void main(String[] args) 
	{
		String s="qwert1";
		int digit=0;
		String ns="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				ns=ns+s.charAt(i);
			}
		}
		System.out.println(ns);
		
	}

}
