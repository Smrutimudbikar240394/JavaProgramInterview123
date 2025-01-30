package stringProgram;

public class counOfAlphabet 
{
	public static void main(String[] args) {
		
		String s="Hellooooooo";
		char c='o';
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
				//String s1=s.replace("o","n");
				//System.out.println(s1);
			}
			
		}
		
		System.out.println(count);
		
	}

}
