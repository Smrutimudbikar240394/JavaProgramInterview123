package JavaProgram;

public class SumOfDigitInNumber {

	public static void main(String[] args) 
	{
		int num=555;
		int sum=0;
		
		while(num!=0)
		{
			sum=sum+num%10;//extract last digit and add in sum variable
			num=num/10; //remove last digit
		}
		System.out.println(sum);

	}

}
