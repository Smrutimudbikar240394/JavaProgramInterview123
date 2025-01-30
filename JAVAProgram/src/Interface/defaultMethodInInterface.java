package Interface;

public interface defaultMethodInInterface 
{
	public void method1();
	
	default void d1()
	{
		System.out.println("deafult method running from interface");
	}
	

}
