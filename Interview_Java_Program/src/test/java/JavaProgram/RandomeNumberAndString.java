package JavaProgram;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomeNumberAndString 
{
	public static void main(String[] args) 
	{
		//Approach
		Random r=new Random();
		//double d1=r.nextDouble(12.0,100.0);
		//double d1=r.nextDouble(100.0);
		//double d1=r.nextDouble();
		
		//System.out.println(d1);
		
		//Approach 2
	//	System.out.println(Math.random());
		
		//Approach 3
		//String num=RandomStringUtils.randomNumeric(5);
		//System.out.println(num);
		
		String str=RandomStringUtils.randomAlphabetic(4);
		System.out.println(str);
		
	}

}
