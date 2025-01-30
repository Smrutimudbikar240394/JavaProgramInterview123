package Basics;

public class test1 
{
	public static void m3()
	{
		System.out.println("running static");
	}
	public void m4()
	{
		System.out.println("running non static");
	}
	public static void main(String[] args) {
		test1 t1=new test1();
		variablesTypes1 vt1=new variablesTypes1();
		System.out.println("Nonstatic variable from diff class : "+ vt1.j);
		System.out.println("static variable from diff class : "+variablesTypes1.a);
		
	}

}
