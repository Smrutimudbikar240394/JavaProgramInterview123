package typeCasting;

public class Son extends Father
{
	public void mobile()
	{
		System.out.println("mobile from son");
	}
	
	public void car()
	{
		System.out.println("car from Son");
	}
	public void money()
	{
		System.out.println("money from son");
	}
	
	public static void main(String[] args) {
		Father f=new Son();
		f.car();
		f.home();
		f.money();
		
	}

}
