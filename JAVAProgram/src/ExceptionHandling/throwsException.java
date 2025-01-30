package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsException
{
	public void m1() throws FileNotFoundException
	{
		System.out.println("before Exception throws");
		
		FileInputStream fis=new FileInputStream("E:\\Desktop");
	}

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		throwsException te2=new throwsException();
		te2.m1();
		
	}
}
