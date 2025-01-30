package TestPractice;

public class shadowVariables
{
	
	    int x = 10; // Instance variable

	    public void display() 
	    {
	        int x = 20; // Local variable
	        System.out.println(x); // Prints 20
	    }
	public static void main(String[] args) 
	{
		shadowVariables sv1=new shadowVariables();
		System.out.println(sv1.x);
		sv1.display();
		
	}

}
