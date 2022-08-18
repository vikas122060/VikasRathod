package polymorphism;

public class ConcreteClaSS extends SuperClassForOverRiding 
{

	public static void main(String[] args) {
		ConcreteClaSS m=new ConcreteClaSS();
		m.test1();

	}

	@Override
	public void test1() {
		System.out.println("good morning");
		
	}

}
