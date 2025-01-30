package stringProgram;

public class CountSpaceBetweenTwoWords 
{
	public static void main(String[] args) 
	{
		String s="This is Automation Script";
		System.out.println(s);
		int count=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
