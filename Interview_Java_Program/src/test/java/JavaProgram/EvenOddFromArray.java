package JavaProgram;

public class EvenOddFromArray {

	public static void main(String[] args) {
		//Appraoch 1
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		/*System.out.println("Extracting even numbers from array.....");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Extracting odd numbers from array.....");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		*/
		
		//Approach 2
		System.out.println("Extract even numbers....");
		for(int v:a)
		{
			if(v%2==0)
			{
				System.out.println(v);
			}
		}
		System.out.println("Extract odd numbers....");
		for(int v:a)
		{
			if(v%2!=0)
			{
				System.out.println(v);
			}
		}
	}

}
