package polymorphism;

public class Son extends Father
{
	public void car()
	{
		System.out.println("son car method running");
	}
	public void money()
	{
		System.out.println("money from Son method");
		
	}
	public void home()
	{
		System.out.println("home from Son");
	}
	public static void main(String[] args)
	{
		Son s=new Son();
		s.car();
		s.home();
		s.money();
		s.Mobile();
		
	}

}
