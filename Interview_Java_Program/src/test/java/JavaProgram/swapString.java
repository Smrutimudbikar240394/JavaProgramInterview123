package JavaProgram;

import java.util.Scanner;

public class swapString 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  String  :");
		String str=scan.nextLine();
		String[] s1 = str.split(" ");
		int len=s1.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
