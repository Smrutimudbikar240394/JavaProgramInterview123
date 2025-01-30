package stringProgram;

public class sample2 
{
	public static void main(String[] args)
	{
		String[] ar= {"ganesh","parvati","lakshmi","saraswati","shankar","ganpati"};
		
		for(String s:ar)
		{
			System.out.println(s);
			
		}
		
		System.out.println("****************8");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
			
		}
		
		
	}

}
