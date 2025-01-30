package TestPractice;

public class d1 
{
	int gvar=10;

	static int staticvar=30;
	
	public void m1()
	{
		int lvar=40;
		System.out.println(lvar);
		
	}
	public static void main(String[] args) 
	{
		d1 d11=new d1();
		d11.m1();
		System.out.println(d11.gvar);
		System.out.println(staticvar);
	}

}
