package accessSpecifier;

public class AccessModifier {

	public static void main(String[] args) {
		//access specifier, access modifier, access provider, visibility labels 
		//public
		//private
		//default
		//protected
    }
	
	public static void test1() {
		System.out.println("publics test1");
	}
	
	private static void test2() {
		System.out.println("privates test2");
	}
	
	static void test3() {
		System.out.println("defaults test3");
	}
	
	protected void test4() {
		System.out.println("protecteds test4");
	}
	

}
