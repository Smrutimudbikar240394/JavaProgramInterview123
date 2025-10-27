package JavaProgram;

public class ReverseStringProgram
{
	public static void main(String[] args) 
	{
		String str="smruti";
		String rev="";
		
		//concat charAt
		
		/*
	    int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
					
		}
		System.out.println(rev);
		
		*/
		
		
		char[] c=str.toCharArray();
		int leng=c.length;
		
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+c[i];
			
		}
		System.out.println(rev);
	}

}
