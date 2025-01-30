package stringProgram;

public class CountduplicateCharInString 
{
	public static void main(String[] args)
	{
		
		String str="Automation Auto";


		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			int count=0;
			
			if(str.indexOf(c)==i)
			{
				for(int j=0;j<=str.length()-1;j++)
				{
					if(str.charAt(j)==c)
					{
						count++;
					}
				}
				
			}
			if (count > 1)
			{
	            System.out.println(c + ": " + count + " times");
			}
		}
		
		
		
	}

}
