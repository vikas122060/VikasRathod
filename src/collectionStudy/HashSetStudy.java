package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet n=new HashSet();
		n.add("monitor");  n.add(123);
		n.add(123.45);     n.add('M');
		n.add(null);       n.add(null);
		n.add(true);       n.add(true);
		
		System.out.println(n);
		System.out.println(n.size());
		System.out.println(n.contains(123));
		System.out.println(n.remove(null));
		System.out.println(n);
		System.out.println(n.contains("monitor"));
		
		//by using for each loop
		System.out.println("===========================");
		for(Object m:n) 
		{
			System.out.println(m);
		}
		System.out.println("===========================");
		//by using iterator
		Iterator it = n.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
