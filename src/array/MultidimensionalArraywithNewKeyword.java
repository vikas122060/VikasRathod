package array;

public class MultidimensionalArraywithNewKeyword {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;		
		a[1][0]=3;
		a[1][1]=4;
		
		for(int i=0;i<=1;i++) 
		{
			{for(int j=0;j<=1;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
		}
			System.out.println();
		}
	}

}
