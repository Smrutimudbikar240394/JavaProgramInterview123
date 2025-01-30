package Interface;

public class multipleInheritanceUsingInterface implements interface1,interface2
{

	
	public void m4() {
		System.out.println("m4 running from interface2");
		
	}


	public void m3() {
		System.out.println("m3 running from interface 1");
		
	}
	
	public static void main(String[] args) {
		multipleInheritanceUsingInterface miui1=new multipleInheritanceUsingInterface();
		miui1.m3();
		miui1.m4();
	}
	

}
