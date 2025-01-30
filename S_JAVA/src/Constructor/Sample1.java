package Constructor;

public class Sample1 {
	//1: example of Default Constructor
	//default constructor -> provided by compiler
	//use: to copy all the members of class into object
	// Sample1()
	// {
	//
	// }
	public void m1()
	{
	System.out.println("method m1 from same class");
	}
	public static void main(String[] args) 
	{
	Sample1 s1=new Sample1(); //default constructor call from same class
	s1.m1();
	//1: Sample1 --> className --> as a dataType
	//2: s1 -> objectName -> to identify/refer object
	//3: new -> keyword -> to create blank/empty object
	//4: Sample1() -> className() -> Constructor call 
	Sample2 s2=new Sample2(); //default constructor call from diff class
	s2.m2();
	}


}
