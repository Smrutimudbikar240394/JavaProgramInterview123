package constructor;

public class userDefinedWithParameter 
{
	public userDefinedWithParameter(int a,int b)
	{
		System.out.println("parametrized constructor");
		int c=a+b;
		System.out.println("addition is : "+c);
		
	}
	
	
	public static void main(String[] args) {
		userDefinedWithParameter udwp1=new userDefinedWithParameter(20, 30);
		
	}
}
