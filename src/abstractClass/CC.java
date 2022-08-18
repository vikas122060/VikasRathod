package abstractClass;

public class CC extends Abstract1 
{

	public static void main(String[] args) {
		CC m=new CC();
		Abstract1 n=new Abstract1() {
			
			@Override
			public void test01() {
				// TODO Auto-generated method stub
				
			}
		};
		m.test01();
		m.test();

	}

	@Override
	public void test01() {
		System.out.println("good evening");
		
	}

}
