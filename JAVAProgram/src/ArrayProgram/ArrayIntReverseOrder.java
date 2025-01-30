package ArrayProgram;

import java.util.Arrays;

public class ArrayIntReverseOrder 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		arr[0]=30;
		arr[2]=45;
		arr[3]=67;
		arr[4]=22;
		Arrays.sort(arr);
		
		String[] s= {"xyz","abc","abc","pqr"};
		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
