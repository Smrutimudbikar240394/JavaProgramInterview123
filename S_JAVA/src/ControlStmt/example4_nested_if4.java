package ControlStmt;

public class example4_nested_if4 {
	public static void main(String[] args)
	{
	int PEM=350;
	int MEM=900;
	//350>=300
	if(PEM>=300) //outer if 
	{
	System.out.println("eligible for mains exam");
	//900>=800
	if(MEM>=800) //inner if 
	{
	System.out.println("got selected");
	}
	else
	{
	System.out.println("Rejected from mains exam MEM<800");
	}
	}
	else
	{
	System.out.println("Not eligible for mains exam PEM<300");
	}
	System.out.println("Hi");
	}

}
