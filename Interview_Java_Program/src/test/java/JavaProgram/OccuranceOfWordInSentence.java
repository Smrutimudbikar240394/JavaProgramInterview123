package JavaProgram;

import java.util.Scanner;

public class OccuranceOfWordInSentence 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String sentence=scan.nextLine();
		
		sentence = sentence.toLowerCase();
		String[] word=sentence.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			if(word[i].equals("visited"))
				continue;
			
			int count=1;
			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="visited";
				}
				
			}
			System.out.println(word[i]+":"+count);
			
		}
		
		
	}
	

}
