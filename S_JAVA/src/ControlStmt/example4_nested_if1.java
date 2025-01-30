package ControlStmt;

public class example4_nested_if1 {
	public static void main(String[] args)
	{
	int PEM=400;
	int MEM=900;
	if(PEM>=300) 
	{
	System.out.println("eligible for mains exam");
	if(MEM>=800) 
	{
	System.out.println("got selected");
	}
	}
	// if(condition1) //outer if
	// {
	// if(condition2) //nested/inner if
	// {
	//
	// }
	// }
	}

}
