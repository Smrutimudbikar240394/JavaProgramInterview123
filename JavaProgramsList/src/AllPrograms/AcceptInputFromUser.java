package AllPrograms;

import java.util.Scanner;

public class AcceptInputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Name of Student: ");
		String sname = scan.next();
		System.out.println(sname.length());
		
	}

}
