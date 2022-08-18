package stringStudy;

public class SplitMethod {

	public static void main(String[] args) {
		String name="You/are/on/fire";
		String name1[]=name.split("/");
		for(int i=0;i<=3;i++) {
			System.out.print(name1[i]+" ");
		}

	}

}
