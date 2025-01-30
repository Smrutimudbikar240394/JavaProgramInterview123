package stringProgram;

public class test {
	
	public static void main(String[] args) 
	         {
	 String str1 = new String("interviewbit");
	 String str2 = new String("INTERVIEWBIT");
	 System.out.println(str1 = str2);
	 
	 
	 
	 
	 System.out.println("***************");
	 
	 String str11 = "scaler";                          //Line1
	 String str22= new String("scaler");      //Line2
	 str2.intern();                                       //Line 3
	 System.out.println(str11 == str22);
	 
	 System.out.println("**********************");
	 
	 
	 String p="abcda";
	 char c='a';
	 
	 int count=0;
	 for(int i=0;i<=p.length()-1;i++)
	 {
		 if(p.charAt(i)==c)
		 {count++;}
		 
		 
	 }
	 System.out.println(count);
	 }
	 
	
	

}
