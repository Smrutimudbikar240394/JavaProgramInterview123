package JavaProgram;

public class EvenOddOfDigitInNumber 
{
	public static void main(String[] args)
	{
		int num=123456;
		int evencount=0;
		int oddcount=0;
		int rem=0;
		
		while(num>0)  //123456
		{
			rem=num%10;  //6
			if(rem%2==0) //1
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		num=num/10;  //12345
		}
		System.out.println("evencount"+evencount);
		System.out.println("Odd COunt: "+oddcount);
		
	}

}
