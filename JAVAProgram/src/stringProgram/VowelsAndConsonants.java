package stringProgram;

public class VowelsAndConsonants 
{
	public static void main(String[] args) 
	{
		String s="an Apple World";
		int v=0;
		int c=0;
		
		for(char ch :s.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				if("AEIOUaeiou".indexOf(ch)!=-1)
				{
					v++;
				}
				else
					c++;
				
			}
			
			
		}
		System.out.println(v);
		System.out.println(c);
		
	}

}
