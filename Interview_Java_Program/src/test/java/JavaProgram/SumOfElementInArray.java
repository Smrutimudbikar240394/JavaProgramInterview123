package JavaProgram;

public class SumOfElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {5,2,7,9,1,4};
		int sum=0;
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		*/
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);

	}

}
