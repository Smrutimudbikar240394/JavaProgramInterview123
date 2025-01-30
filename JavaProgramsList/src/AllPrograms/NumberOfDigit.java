package AllPrograms;

public class NumberOfDigit 
{
	public static void main(String[] args) 
	{
		int number=7012345;
		int count=0;
		int temp=number;
		
		System.out.println("Given Number :"+number);
		
		while(number>0)
		{
			number=number/10;
			count=count+1;
		}
		
		System.out.println("Number of digit present :"+count);
		
	}

}
