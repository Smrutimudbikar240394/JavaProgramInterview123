package ArrayProgram;

public class twoDimensional 
{
	public static void main(String[] args) 
	{
	//	  0  1  2
	//	0 22 12 20
	//	1 34 23 22
		int[][] ar=new int[2][3];
		ar[0][0]=22;
		ar[0][1]=12;
		ar[0][2]=20;
		ar[1][0]=34;
		ar[1][1]=23;
		ar[1][2]=22;
		
		
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
