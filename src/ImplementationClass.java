
public class ImplementationClass implements MyInterface1
{

	public static void main(String[] args) {
		ImplementationClass m=new ImplementationClass();
		m.test();
		m.test1();

	}

	@Override
	public void test() {
		System.out.println("good evening");
		
	}

	@Override
	public void test1() {
		System.out.println("good night");
		
	}

}
