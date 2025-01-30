package javaProgram;



public class thisAndSuperKeyword extends test1
{
	int a=20;
	
	public void m11()
	{
		int a=10;
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(this.a);
	
	}
	
	public static void main(String[] args) {
		
		thisAndSuperKeyword tak1=new thisAndSuperKeyword();
		tak1.m11();
	}

}
