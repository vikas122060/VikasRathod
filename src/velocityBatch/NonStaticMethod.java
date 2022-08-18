package velocityBatch;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NonStaticMethod n=new NonStaticMethod(); //className objectName=New className();
        n.Add();
        MethodStudy M1=new MethodStudy();
        M1.test();
}
    public void Add() {
    	int a=10;
    	int b=20;
    	int c=a+b;
    	System.out.println(c);
    }
	
	
}
