package com.variabletypes;

public class staticVAR{
	//Instance variable -->In Java, an instance variable is a variable that is declared inside a class
	//but outside any method, constructor, or block.
	//It is associated with an instance (object) of the class, meaning each object has its own copy of the variable.
	// when u are creating instance and object , variables will execute ,(it will vary object to object )
	String name; //--> Instance variable 
	String address;
	static String City="Chandrapur";//--> it belong to class only so Class variable and not depend on 
	static int i=0;  //--> if u remove static word, then each obj will consider i++ separately.
	
	
	
	static {
		String City="Chandrapur";
		i=5;            //------> It is static block to initialize all static variable.
		
	}
	staticVAR(String name,String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i); //-> Variable comes under constructor called local variable 
	}
	
	public void getaddress() {
		
	      System.out.print( name );
	      System.out.print( address );
	     // System.out.print( City );
	}
	
	// Static method not depend on object to call , we can call by using class name
	//Only variables can be used in static method.
	
	public static void getcity() {
		
		System.out.print(City);
	}
	
	public static void main(String[] args) {
		staticVAR obj=new staticVAR("Rushali","Mejar gate");
		staticVAR obj1=new staticVAR(" Sakshi ","Tukum" );
		obj.getaddress();
		System.out.println();
		obj1.getaddress();
		System.out.println();
		
		staticVAR.getcity();
		//System.out.println(staticVAR.i);
		
	}
}