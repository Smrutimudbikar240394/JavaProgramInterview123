package TypesOfVariables;

public class Sample4 {
	//3: example non-static global variable 
	int c=10; //non-static global variable
	public static void main(String[] args) 
	{
	//1: non-static global variable call from same class
	Sample4 s4=new Sample4();
	System.out.println(s4.c);
	//2: non-static global variable call from diff class
	Sample5 s6=new Sample5();
	System.out.println(s6.d);
	}
	public static void m3() 
	{
	Sample4 s5=new Sample4();
	System.out.println(s5.c);
	}
	public void m4() 
	{
	System.out.println(c);
	}


}
