package stringProgram;

public class numberOfOccuranceOfCharacter 
{
	public static void main(String[] args) 
	{
		String s="aabbmn";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			count=0;
			for(int j=0;j<=s.length()-1;j++)
			{
				if(j<i &&ch[i]==ch[j])
				{
					break;
				}
				if(ch[j]==ch[i])
				{
					count++;
				}
				if(j==s.length()-1)
				{
					System.out.println("The Char   "+ch[i]+"  is present  "+count+"  times");
				}
			}
		}
	}

}
