package AllPrograms;

public class palindromeNumber 
{
	public static void main(String[] args)
	{
		int number=78687;
		int temp,reverse=0;
		int original_number=number;
		
		System.out.println("Number:"+number);
		
		while(number>0)
		{
			temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
			
		}
		System.out.println("Reverse Number: "+reverse);
		
		
		if(original_number==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
