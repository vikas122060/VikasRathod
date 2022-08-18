package velocityBatch;

public class Constructor {
	int a;
	int b;
	public Constructor() {
		a=10;
		b=20;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		c.Test();
		c.Test1();
		

	}
	public void Test() {
	int add=a+b;
	System.out.println(add);
				}
	public void Test1() {
		int sub=a-b;
		System.out.println(sub);
	
		
	}

}
