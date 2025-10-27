package JavaProgram;

import java.util.Scanner;

public class largestOf3Numbers 
{
	public static void main(String[] args)
	{
		//int a,b,c;
		//Approach 1
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		
		int a=scan.nextInt();
		
		System.out.println("Enter 2nd number:");
		
		int b=scan.nextInt();
		
		System.out.println("Enter 3rd number:");
		
		int c=scan.nextInt();
		
	/*	if(a>b &&a>c)
		{
			System.out.println(a+"is lagrest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is lagrest number");
		}
		else
		{
			System.out.println(c+"is lagrest number");
		}
		*/
		
		//Approach 2: ternary operator
		
		int lagrest1=a>b?a:b;
		int lagrest2=c>lagrest1?c:lagrest1;
		
		System.out.println(lagrest2+"is largest number");
		
		
	}
	

}
