package array;

public class MultidimensionalArrayWithoutNewKeyword {

	public static void main(String[] args) {
		char grade[][]= {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
		
		for(char i=0;i<=2;i++) 
		{
			for(char j=0;j<=3;j++) {
			
				System.out.print(grade[i][j]+" ");
			}
			
			System.out.println();
		}
			
		}

	

}
