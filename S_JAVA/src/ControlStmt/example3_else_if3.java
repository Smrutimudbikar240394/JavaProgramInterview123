package ControlStmt;

public class example3_else_if3 {

	public static void main(String[] args)
	{
	int SA=700;
	//30000>=20000
	if(SA>=20000)
	{
	System.out.println("20%");
	}
	//30000>=10000
	else if(SA>=10000) 
	{
	System.out.println("10%");
	}
	else if(SA>=1000) //50 to 59 
	{
	System.out.println("5%");
	}
	else if(SA>=500) //35 to 49
	{
	System.out.println("2%");
	}
	else
	{
	System.out.println("no discount");
	}
	}

}
