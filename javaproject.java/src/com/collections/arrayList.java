package com.collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> a=new ArrayList<String>();
		//aLL this collections framework part comes under java util packages
		//all classes which implements list interface can accept duplicate values 
		//Arraylist, Linked list, vector -->implementing list interface -->can accept duplicate values
		
		//array have fixed size whereas arraylist can grow dynamically.
		//u can access any index 
		a.add("Rushali");
		a.add("modak");
		a.add("modak");
		System.out.println(a);
		a.add(0, "sakshi");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("rtnb"));
		System.out.println(a.indexOf("modak"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
