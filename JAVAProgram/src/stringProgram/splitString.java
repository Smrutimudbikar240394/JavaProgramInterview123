package stringProgram;

public class splitString
{
	public static void main(String[] args) 
	{
		String str="Hello World test ";
		String[] arr=str.split(" ");
		
		for(String p:arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i-- )
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
