package Interface;

public class deafultMethodClass implements defaultMethodInInterface
{

	
	public void method1() 
	{
		System.out.println("method 1 running from default method inteface");
		
	}
	
	public static void main(String[] args) {
		deafultMethodClass dmc1=new deafultMethodClass();
		dmc1.d1();
		dmc1.method1();
	}
	

}
