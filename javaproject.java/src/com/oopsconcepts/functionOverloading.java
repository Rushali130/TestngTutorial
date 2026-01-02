package com.oopsconcepts;


//functionOverloading ---> If we have same method name but difference in argument content then it is function overloading 
//Either argument count should be different or argument data type should be different 

public class functionOverloading {
	
	public void getData(int a) 
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		functionOverloading c1=new functionOverloading();
		c1.getData(3);
        c1.getData("RUSHALI");
	}
	

}
