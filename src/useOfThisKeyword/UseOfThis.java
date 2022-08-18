package useOfThisKeyword;

public class UseOfThis {
	int a=100;
	int b=200;

	public static void main(String[] args) {
	UseOfThis m=new UseOfThis();
	m.keyword();

	}
	
	public void keyword() {
	    int a=150;
		int b=160;
		int sum=a+b+150;
		int sum1=this.a+150;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(sum1);
		System.out.println(sum);
		
		
	}

}
