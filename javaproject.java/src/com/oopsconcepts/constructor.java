package com.oopsconcepts;

public class constructor {
	
	public static String name="Rushali Modak";//------------> Global variable 
	
	//Default constructor
	public constructor() 
	{
		//whatever you write inside the constructor, it will executes when you create object of class.
		System.out.println("Constructor demo");
		System.out.println("Constructor demo 1 and 2");
		System.out.println(constructor.name);
		
		}
	//Parameterized Constructor
//	public constructor(int a, int b) 
//	{
//		System.out.println(a+b);
//		System.out.println(constructor.name);
//	}
//	public constructor(String str) 
//	{
//		System.out.println(str);
//		System.out.println(constructor.name);
//	}
	
	public void getdemo() {
		System.out.println("Prachi lande");
	}
	public static void main(String[] args) {
	//constructor executes block of code whenever object is created 
	//constructor name should always be class name
	//constructor is same as methods, only differnece is constructor will not return any values
	//When ever object is created , constructor is called 
		constructor c=new constructor();
		c.getdemo();
		//constructor c2=new constructor("Hello");
		//constructor c1=new constructor(3,5);
		
		
		//if we dont pass any parameter in constructor then it will executes default constructor only.
	}

}
