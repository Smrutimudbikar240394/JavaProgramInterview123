package ArrayProgram;

public class twodimensional1 
{
	public static void main(String[] args) 
	{
		int [][] ar= {{10,20,30},{11,22,33},{12,23,34}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
