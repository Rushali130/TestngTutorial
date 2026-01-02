package com.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Hashtable<Integer,String> hb=new Hashtable<Integer,String>();
		hb.put(1, "ankesh");
		hb.put(2, "Bhupi");
		hb.put(23, "shreya");
		hb.put(20, "Kalyani");
		Set sb=hb.entrySet();
		Iterator<String> it=sb.iterator();
		System.out.println(it.next());

}
}
