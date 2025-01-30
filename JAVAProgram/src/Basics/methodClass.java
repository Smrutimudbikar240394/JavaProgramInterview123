package Basics;

public class methodClass 
{
	public static void m1()
	{
		System.out.println("running static method ");
	}
	
	public void m2()
	{
		System.out.println("running non static method");
	}

	public static void main(String[] args) 
	{
		methodClass mc1=new methodClass();
		
		m1();
		mc1.m2();
		test1.m3();
		
		test1 t2=new test1();
		t2.m4();
	
		
	}
}
