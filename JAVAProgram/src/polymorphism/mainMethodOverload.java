package polymorphism;

public class mainMethodOverload
{
	public static void main(String[] args) 
	{
		System.out.println("main string method");
		main(200);
		
	}
	
	public static void main(int num1)
	{
		System.out.println("main method int");
	}

}
