package stringProgram;

public class AddAllIndividualNumberFromString 
{
	public static void main(String[] args) {
		
		String s="ab551pqr4";
		int digit=0;
		String ns ="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
			  ns=s.substring(i,i+1);
			  digit=digit+Integer.parseInt(ns);
			}
		}
		System.out.println(digit);
		
		
		
	}
	

}
