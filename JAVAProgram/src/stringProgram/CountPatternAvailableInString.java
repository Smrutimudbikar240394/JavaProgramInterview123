package stringProgram;

public class CountPatternAvailableInString 
{
	public static void main(String[] args) {
		
	
	String pattern="abc";
	String txt="abcdefabc";
	int m=pattern.length();
	int n=txt.length();
	int res=0;
	
	for(int i=0;i<=n-m;i++)
	{
		int j;
		for(j=0;j<m;j++)
		{
			if(txt.charAt(i+j)!=pattern.charAt(j))
			{
				break;
			}
			
		}
		if(j==m)
		{
			res++;
			j=0;
			
		}
	}
	
	System.out.println(res);
	}

}
