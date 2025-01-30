package stringProgram;

public class removeDuplicateCharFromString 
{
	public static void main(String[] args) {
		String s="aabbccddefg";
		String s1="";
		
		for(int i=0;i<s.length()-1;i++)
		{
			boolean found=false;
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					found=true;
					break;
				}
			}	
				if(found==false)
				{
					s1=s1+s.charAt(i);
				}
			
		}
		System.out.println(s1);		
	}

}
