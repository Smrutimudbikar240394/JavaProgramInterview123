package ControlStmt;

public class example4_nested_if2 {
	public static void main(String[] args)
	{
	int SA=7000;
	 // 7000>=500
	if(SA>=500) 
	{
	System.out.println("No delivery charges applied");
	// 7000>=5000
	if(SA>5000) 
	{
	System.out.println("10 % off");
	}
	}
	}

}
