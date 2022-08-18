package constructor;

public class ConstructorStudy 
{  int a;
	
	
	public ConstructorStudy() {
	a=10;
}

	public static void main(String[] args) {
	ConstructorStudy m=new ConstructorStudy();	
    m.test();
  
	}
	
	public void test() {
		int a=20;
		int sum=this.a+150;
		System.out.println(sum);
	}

}
