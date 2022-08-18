package constructor;

public class Cons 
{ int a;
  int b;
  int c;
  
  Cons(int a1){
	a=a1;  
  }
  Cons(int a1, int a2){
	  a=a1;
	  b=a2;
  }
  Cons(int a1, int a2, int a3){
	 a=a1;
	 b=a2;
	 c=a3;
  }


	public static void main(String[] args) {
		Cons m=new Cons(10);
		m.test();
		Cons n=new Cons(10, 20);
		n.test1();
		Cons f=new Cons(30, 40, 50);
		f.test2();

	}
	public void test() {
		System.out.println(a);
	}
	public void test1() {
		int sum=a+b;
		System.out.println(sum);
	}
	public void test2()
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	
		
		
	

}
