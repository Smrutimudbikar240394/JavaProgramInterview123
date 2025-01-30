package stringProgram;

public class evenLengthWord
{
	public static void main(String[] args)
	{
		String s="This is String World in Java";
		//String[] ch=s.split(" ");
		for(String p:s.split(" "))
		{
			if(p.length()%2==0)
			{
			System.out.println(p);	
			}
		}
		String s1 = ""; 
		 printWords(s1); 
		
		
	}
	public static void printWords(String s) 
	 { 
	 
	  // Splits Str into all possible tokens 
	  for (String word : s.split(" ")) 
	 
	   // if length is even 
	   if (word.length() % 2 == 0) 
	 
	    // Print the word 
	    System.out.println(word); 
	 } 

}
