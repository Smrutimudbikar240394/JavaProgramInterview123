package typeCasting;

public class B extends A
{
	public void m1()
	{
		System.out.println("m1 method from B: Sub Class");
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		
		A aa=(A)b;   //upcasting
		aa.m1();
		
		
	A a1=new A();
		
		B bb=(B)a1;
		bb.m1();
		
		
		A a2=new B();
		B bb1=(B)a2;
		bb1.m1();
		
		
	}

}
