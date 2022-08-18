package stringStudy;

public class StringStudy1 {

	public static void main(String[] args) {
		String s="hello";//string declaration and initialization with object
		String s1="HELLO EVERYONE";
		
		System.out.println(s.length());//using length method with object@[1]
		int mylength=s1.length();//<=====first way of calling using object
		System.out.println(mylength);
		System.out.println(s1.length());//<=====second way of calling direct using object
		System.out.println("================================");
		
		System.out.println(s.toUpperCase());//using toupperCase method with object@[2]
		System.out.println(s1.toLowerCase());//using toLowerCase method with object@[3]
		System.out.println("================================");
		
		String v0="velocity";
		String v1="velocity";
		String v2=new String("velocity");
		String v3=new String("velocity");
		String v4=new String("Velocity");
		String v5=new String("");
		String v6=new String(" ");
		System.out.println(v0.contains("vlc"));
		
		System.out.println(v0==v1);//using == sign @[==]
		System.out.println(v2==v3);
		System.out.println(v0.equals(v1));//using equals method with object@[4]
		System.out.println(v2.equals(v3));
		System.out.println(v3.equals(v4));
		System.out.println(v0.equalsIgnoreCase(v1));//using equalsIgnoreCase method with object@[5]
		System.out.println(v3.equalsIgnoreCase(v4));
		System.out.println(v0.contains("vel"));//using contains method with object@[6]
		
		System.out.println(v4.isEmpty());
		System.out.println(v5.isEmpty());//using isEmpty method with object@[6]
		System.out.println(v6.isEmpty());
		System.out.println(v5.isBlank());//using isBlank method with object@[]
		System.out.println(v6.isBlank());
		System.out.println(v4.isBlank());
		System.out.println(v4.charAt(4));//using charAt method with object@[7]
		System.out.println(v0.startsWith("vel"));
		

	}

}
