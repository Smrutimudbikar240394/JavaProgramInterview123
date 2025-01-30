package Program;

public class PronicNumber 
{
	public static void main(String[] args) {
		
		
		int n1=0;
		int n2=0;
		boolean IsPronic = true;
		
		for(int i=0;i<=5;i++)
		{
			if(i*(i+1)==5)
			{
				IsPronic=true;
				n1=i;
				n2=i+1;
				break;
			}
			
		}
		
		if(IsPronic)
		{
			System.out.println(" 5 Number is pronic");
		}
		else
		{
			System.out.println("5 number is not pronic");
		}
	}
	

}
