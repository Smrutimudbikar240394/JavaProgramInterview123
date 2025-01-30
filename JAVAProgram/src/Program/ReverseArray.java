package Program;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] a= {10,3,5,20,34,2};
	
		int start=0,temp=0;
		int end=a.length-1;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
		
		
		
		for(int num:a)
		{
			System.out.print(num+" ");
		}
	}

}
