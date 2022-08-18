package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList L=new LinkedList();
		L.add("monitor");  L.add(123);
		L.add(123.45);     L.add('M');
		L.add(null);       L.add(null);
		L.add(true);       L.add(true);
		
		System.out.println(L);
		System.out.println(L.size());
		System.out.println(L.get(3));
		System.out.println(L.contains(123));
		System.out.println(L.remove(null));
		System.out.println(L);
		//System.out.println(L.contains("monitor"));
		//System.out.println(L.peek());
		//System.out.println(L.peekFirst());
		//System.out.println(L.peekLast());
		//System.out.println(L);
		//System.out.println(L.poll());
		//System.out.println(L);
		//System.out.println(L.pollLast());
		//System.out.println(L);
		//System.out.println(L.pop());
		//System.out.println(L);
		//System.out.println(L.pop());
		
		System.out.println("==========================");
		//by using for loop
		for(int i=0;i<=L.size()-1;i++) 
		{
			System.out.println(L.get(i));
		}
		System.out.println("==========================");
		//by using for each loop
		for(Object m:L) 
		{
			System.out.println(m);
		}
		System.out.println("==========================");
		//by using iterator
		Iterator it = L.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("==========================");
		
		//by using list iterator
		ListIterator li = L.listIterator();
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		
		System.out.println("==========================");
		while(li.hasPrevious()) 
		{
			System.out.println(li.previous());
		}

	}

}
