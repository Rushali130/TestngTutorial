package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "AASHA");
		hm.put(1, "Sanu");
		hm.put(2, "sanika");
		hm.put(3, "sahil");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		
		//Above part is of hashMap , now set part is started 
		Set sm=hm.entrySet();
		Iterator<String> it=sm.iterator();
		while(it.hasNext())
		{
			
			//Map.Entry mp=(Map.Entry)it.next();
//			System.out.println(mp.getKey());
//			System.out.println(mp.getValue());
		}
		
		
	}

}
