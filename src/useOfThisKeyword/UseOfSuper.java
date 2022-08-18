package useOfThisKeyword;

import java.lang.reflect.Method;

public class UseOfSuper extends A 
    {
	int v=200;

	public static void main(String[] args) {
		UseOfSuper n=new UseOfSuper();
		n.method();
		

	}
	
	public void method() {
		int m=100;
		int sum1=this.v+m;
		int sum2=super.v+100;
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
