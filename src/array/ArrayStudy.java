package array;

public class ArrayStudy {

	public static void main(String[] args) {
	String ar[]=new String[4];
		
		ar[0]="Velocity";
		ar[1]="Corporate";
		ar[2]="Training";
		ar[3]="Center";
		
		System.out.println(ar.length);
		
		System.out.println(ar[0]);
	
		
		for(int i=0;i<=3;i++)
		{
		System.out.println(ar[i]);
		}
		System.out.println("===========================");
		
		for(int i=3;i>=0;i--) 
		{
			System.out.println(ar[i]);
			
		}

    

	}

}
