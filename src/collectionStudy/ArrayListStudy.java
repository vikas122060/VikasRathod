package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		
	    ar.add('I');
	    ar.add("love");
	    ar.add("Pune");
	    ar.add(123.456);
	    ar.add(null);
	    ar.add(true);
	    ar.add(null);
	    ar.add(true);
	    
	    System.out.println(ar);
	    System.out.println(ar.size());
	    System.out.println(ar.remove(6));
	    System.out.println(ar.get(3));
	    System.out.println(ar.contains("I"));

	}

}
