package ArrayProgram;

public class printStringArray 
{
	public static void main(String[] args) 
	{
		String[] ar=new String[5];
		
		ar[0]="smruti";
		ar[2]="shruti";
		ar[3]="priya";
		ar[4]="abc";
		
		for(String w:ar)
		{
			System.out.println(w);
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
				
		
	}

}
