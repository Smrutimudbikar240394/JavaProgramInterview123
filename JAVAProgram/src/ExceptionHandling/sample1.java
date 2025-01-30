package ExceptionHandling;

public class sample1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		int div=0;
		try
		{
			div=a/b;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmentic exception occured");
		}
		System.out.println(div);
		
	}

}
