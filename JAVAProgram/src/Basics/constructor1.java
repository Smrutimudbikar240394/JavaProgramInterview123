package Basics;

public class constructor1 
{
	String empName;
	int empid;
	String empCEOName;
	
	 constructor1(String name,int id,String ceo) 
	 {
		empName=name;
		empid=id;
		empCEOName=ceo;
	}
	 
	 public void empInfo()
	 {
		 System.out.println("emp Info :"+empName+" ,"+empid+","+empCEOName);
	 }
	 
	 public static void main(String[] args) {
		constructor1 c1=new constructor1("smruti", 101, "AG");
		constructor1 c2=new constructor1("shruti", 102, "AG");
		c1.empInfo();
		c2.empInfo();
	}

}
