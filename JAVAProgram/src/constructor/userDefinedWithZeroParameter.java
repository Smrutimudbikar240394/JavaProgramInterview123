package constructor;

public class userDefinedWithZeroParameter 
{
	int num1=10;
	int num2=20;
	public userDefinedWithZeroParameter() {
		System.out.println("num 1 :"+num1);
		System.out.println("num 2 "+num2);
	}
	
	public void add()
	{
		System.out.println("addition :"+(num1+num2));
	}
	
	public static void main(String[] args) {
		userDefinedWithZeroParameter u1=new userDefinedWithZeroParameter();
		u1.add();
		
		userDefined2 ud1=new userDefined2();
		userDefined2.multi();
	}

}
