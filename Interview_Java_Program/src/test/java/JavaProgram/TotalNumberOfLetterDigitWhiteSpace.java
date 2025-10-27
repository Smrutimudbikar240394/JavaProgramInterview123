package JavaProgram;

public class TotalNumberOfLetterDigitWhiteSpace 
{
	public static void main(String[] args) 
	{
		String str="--abc 12 @de1  3 #";
		int countLetter=0;
		int countDigit=0;
		int countWhiteSpace=0;
		int countSpclChar=0;
		
		for(int i=1;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch))
			{
				countLetter++;
			}
			else if(Character.isDigit(ch))
			{
				countDigit++;
			}
			else if(Character.isWhitespace(ch))
			{
				countWhiteSpace++;
				
			}
			else
			{
				countSpclChar++;
			}
			System.out.println("count of Letter"+countLetter);
			System.out.println("count of Digit"+countDigit);
			System.out.println("count of white space"+countWhiteSpace);
			System.out.println("count of special char"+countSpclChar);
		}
		
	}

}
