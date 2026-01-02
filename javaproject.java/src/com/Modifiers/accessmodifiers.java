package com.Modifiers;

public class accessmodifiers{
	protected int i=5;
	
	public static void main(String[] args) {
		//4 types of modifier
		//Public, private, protected, default
		
		//default modifier-->We can access anywhere in packaeg not in other package 
		//Public -->variable/method as public . will have access across all packages 
		//Private-->You can not access variable/methods outside class
		//protected-->variable/method as protected , you can access those in sub class only (other packages)
		
		
		//Default and protected 
		//Default we can acess method in all classes in same packages
		//Protected we can acess method in all classes in same packages and sub classes which inherites parent class in other package 
		
	}
}