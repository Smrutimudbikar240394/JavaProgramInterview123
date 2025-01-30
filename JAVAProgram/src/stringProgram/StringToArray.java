package stringProgram;

public class StringToArray 
{
	public static void main(String[] args) {
		String str="My Name Is Smruti";
		String s1="test";
		String s2="test1";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.replace("test","testing"));
		
		
		//String to array
		String[] sarr=str.split("");
		for(int i=0;i<=sarr.length-1;i++)
		{
			System.out.print(sarr[i]);
		}
		
		
		System.out.println("******");
		System.out.println(str);
	}

}
