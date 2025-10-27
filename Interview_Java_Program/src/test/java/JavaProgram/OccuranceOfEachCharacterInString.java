package JavaProgram;

import java.util.Scanner;

public class OccuranceOfEachCharacterInString
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=scan.next();
		
		while (str.length() > 0) 
		{
		    char ch = str.charAt(0);//a
		    int count = 0;

		    for (int i = 0; i < str.length(); i++) 
		    {
		        if (str.charAt(i) == ch)//a==a
		            count++;
		    }

		   System.out.print(ch+""+count);
		   // System.out.println(ch + " : " + count);
		    
		 str = str.replace(String.valueOf(ch), ""); 
		  // System.out.println(str);
		}
		
		
			
		}
		
	

}
