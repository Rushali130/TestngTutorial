package com.methods;

import com.oopsconcepts.Ichildclassdemo;


public class MethodAccess {

	public static void main(String[] args) {
       
		MethodAccess ab = new MethodAccess();
		String name = ab.getData();  //-------------------------method 1
		System.out.println(name);
		
		ToAccessmethodFromOtherClass e1= new ToAccessmethodFromOtherClass();
		int sum= e1.AccessmethodFromOtherClass(); //-------------method 2
		
		getUserData(); //---------------------method 3
		
		Ichildclassdemo p=new Ichildclassdemo();
 		p.audiosystem();
 		p.colour();
		
	
	}

	public String getData() {
		// TODO Auto-generated method stub
		System.out.println("Rushali Modak");
		return "hello world";
	}

	public static String getUserData() {
		// TODO Auto-generated method stub
		System.out.println("Automation academy");
		return "hello world";
}
	
}
