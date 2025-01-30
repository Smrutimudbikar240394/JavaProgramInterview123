package constructor;

public class ConstructorOverloading 
{
	int num1,num2;
	ConstructorOverloading()
	{
		
		
		System.out.println("zero parameter constructor calling");
		num1=50;
		num2=1000;
		
		
	}
	
	ConstructorOverloading(int a,int b)
	{
		
		
		num1=a;
		
		num2=b;
		System.out.println("parameterized constructor running ");
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		
	}
	

	public void sub()
	{
		System.out.println("substraction is : "+(num1-num2));
	}
	
	
	ConstructorOverloading(String s)
	{
		System.out.println("String constructor running");
		System.out.println("String is : "+s);
	}
	
	
	public void add()
	{
		System.out.println("Addition is : "+(num1+num2));
	}

	public static void main(String[] args) 
	{
		ConstructorOverloading co1=new ConstructorOverloading();
		co1.add();
		
		ConstructorOverloading co2=new ConstructorOverloading(50, 20);
		co2.sub();
		
		ConstructorOverloading co3=new ConstructorOverloading("Smruti");
		
		
	}
}
