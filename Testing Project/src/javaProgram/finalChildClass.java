package javaProgram;

//public class finalChildClass extends finalParentClass
public class finalChildClass
{
	
	public static void main(String[] args) 
	{
		
		final int a=40;
		finalParentClass fpc1=new finalParentClass();
		//fpc1.m1();
		
		finalChildClass fcc1=new finalChildClass();
		//fcc1.m1();
		
		fpc1.mm1();
		//int a=30;
		if(a==40)
		{
			//a=30;
			System.out.println(a);
		}
		
		System.out.println(a);
		
		
	}
	
	
	public final void  m2()
	{
		System.out.println("final m2 method running");
	}

}
