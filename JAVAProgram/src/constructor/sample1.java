package constructor;

public class sample1 
{
	/* sample1()
	{
		System.out.println("sample 1 constructor running");
	}*/
	
	 public void m1()
	 {
		 System.out.println("m1 method running");
	 }
	 
	 public static void main(String[] args) 
	 {
		sample1 s1=new sample1(); //default constructor 
		s1.m1();
		
		sample2 s2=new sample2();
		s2.staticmethod1();
	}

}
