package Program;

public class MinAndMaxArray 
{
	public static void main(String[] args) 
	{
		
		
		int[] a= {20,4,56,8,18};
		int min=a[0],max=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
