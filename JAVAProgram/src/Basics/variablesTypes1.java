package Basics;

public class variablesTypes1 
{
	int j=100;
	static int a=10; //static variable
	public void m1()
	{
		int num=100; //local variable
		System.out.println("Number of num is: "+num);
		System.out.println("static variable is :"+a);
		System.out.println("global variable "+j);
	}
	public static void main(String[] args) 
	{
		variablesTypes1 sc1=new variablesTypes1();
		sc1.m1();
		System.out.println("********");
		System.out.println(a);
		
		
		
		
	}

}
