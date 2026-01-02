package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
	//hashset , treeSet,LinkedHashSet -->Implementating Set interface
	//This interface does not accept duplicate values
	//There is no guarantee element stored in sequntial manner

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h=new HashSet<String>();
		h.add("Rushu");
		h.add("prachi");
		h.add("salshi");
		h.add("alka");
		System.out.print(h);
		System.out.println(h.size());
		System.out.println(h.remove("alka"));
		System.out.println(h);
		
		Iterator<String> i=h.iterator();
		//if we have 4 element in our set , then iterator will move 4 times
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
	}

}
