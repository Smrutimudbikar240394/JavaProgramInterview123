package stringProgram;

public class sample1 
{
	public static void main(String[] args) 
	{
		String str="smruti";
		String str1="Java Programming";
		String str2="THIS IS LAPTop";
		String s="";
		int i=80;
		
		System.out.println(s.isEmpty());
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf("v"));
		System.out.println(str1.lastIndexOf("a"));
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,12));
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.equals(str));
		System.out.println(str2.contains("is"));
		
		System.out.println(s.valueOf(i));
		
	}

}
