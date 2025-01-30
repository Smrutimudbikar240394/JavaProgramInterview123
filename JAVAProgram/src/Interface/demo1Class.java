package Interface;

public class demo1Class implements demo1
{

	
	public void m1() {
		System.out.println("m1 method running");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method running");
		
	}

	public static void main(String[] args) {
		demo1Class d1=new demo1Class();
		d1.m1();
	}
	
	

	
	

}
