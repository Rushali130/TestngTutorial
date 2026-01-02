package com.oopsconcepts;

import com.variabletypes.staticVAR;

public class superkeyword {
	
	
	int a=3;
	
	public void getdata() {
		int a=2;
		System.out.println(this.a);
		System.out.println(this.a);		
	}
	//this word refers current object --> Object scope lies in class level 
    //if we have same variable outside method as well as inside method and u want to print outside variable thne use "this"
	public static void main(String[] args) {
		
		superkeyword s=new superkeyword();
		s.getdata();
		
		
		

	}

}
