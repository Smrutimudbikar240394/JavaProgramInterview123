package TypesOfVariables;

public class Sample2 {
	//2: example of static global variable
	static int a=10; //static global variable
	public static void main(String[] args) 
	{
	//1: static global variable call from same class
	System.out.println(a); //variableName
	//2: static global variable call from diff class
	System.out.println(Sample3.b); //diffClassName.variableName
	}
	public static void m1() 
	{
	System.out.println(a);
	}
	public void m2() 
	{
	System.out.println(a);
	}

}
