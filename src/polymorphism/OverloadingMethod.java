package polymorphism;

public class OverloadingMethod {

	public static void main(String[] args) {
		OverloadingMethod n=new OverloadingMethod();
		n.method1();
		n.method1(10);
		n.method1(20, 20);

	}
	
	public void method1() {
		System.out.println("zero parameter");
	}
	
	public void method1(int a) {
		System.out.println("value of a is "+a);
		
	}
	
	public void method1(int a, int b) {
		System.out.println(a+b);
	}

}
