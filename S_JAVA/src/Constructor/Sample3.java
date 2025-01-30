package Constructor;

public class Sample3 {
	//2: User defined constructor 
	//1: variable declaration
	int num1; //10
	int num2; //20
	//2: initialize variable
	//user defined constructor -> provided by 
	//use1: to initialize global variable
	//use2: to copy all the members of class into object
	Sample3()
	{
	num1=10;
	num2=20;
	}
	//3: variable usage
	public void add() 
	{
	System.out.println(num1+num2);
	}
	public void mult() 
	{
	System.out.println(num1*num2);
	}
	public static void main(String[] args)
	{
	Sample3 s3=new Sample3(); //user defined constructor call from same class 
	s3.add();
	s3.mult();
	}

}
