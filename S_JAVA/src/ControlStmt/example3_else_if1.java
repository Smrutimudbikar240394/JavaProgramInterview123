package ControlStmt;

public class example3_else_if1 {

	public static void main(String[] args)
	{
	int marks=32;
	//32>=65
	if(marks>=65)
	{
	System.out.println("Distinction");
	}
	// 32>=60 & 62<=64 = true
	else if(marks>=60 & marks<=64) //60 to 64
	{
	System.out.println("1st class");
	}
	// 32>=50 & 55<=59
	else if(marks>=50 & marks<=59) //50 to 59 
	{
	System.out.println("2nd class");
	}
	// 32>=35 & 44<=49
	else if(marks>=35 & marks<=49) //35 to 49
	{
	System.out.println("Pass");
	}
	// 32<=34
	else if(marks<=34)
	{
	System.out.println("Fail");
	}
	// true & true => true
	// true & false => false
	// false & true => false
	// false & false => false
	// if(condition1)
	// {
	//
	// }
	// else if(condition2)
	// {
	//
	// }
	// else if(condition3)
	// {
	//
	// }
	// else if(condition3)
	// {
	//
	// }
	}
}
