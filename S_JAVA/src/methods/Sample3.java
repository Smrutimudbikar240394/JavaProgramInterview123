package methods;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1: create object of same/current class
		//2: method call -> objectName.methodName();
		//className objectName=new className(); -> syntax of object creation
		Sample2 s2=new Sample2();
		s2.m3();
		s2.m4();
		//1: Sample4 -> className -> as a dataType (objectType)
		//2: s4 -> objectName -> use to identify/refer object
		//3: new -> keyword -> use to create blank/empty object
		//4: Sample4() -> className() -> constructor -> use to copy all the members of class into object
		}
		//non-static regular method
		public void m5() 
		{
		System.out.println("non-static method m5 from same class");
		}
		//non-static regular method
		public void m6() 
		{
		System.out.println("non-static method m6 from same class");
		}
		
		public void add(int a,int b)
		{
			int c= a+b;
			System.out.println("addition c="+c);
		}
	

}
