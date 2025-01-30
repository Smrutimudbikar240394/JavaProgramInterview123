package AbstractClass;



public class sample2 extends Sample1
{

	
	public void m3() 
	{
		System.out.println("m3 from abstract complete in concrete class");
		
	}
	
	public static void main(String[] args) {
		sample2 s2=new sample2();
		s2.m1();
		s2.m3();
		
	}
	

}
