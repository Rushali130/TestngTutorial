package javaproject.java;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);  //Scanner class ka object sc hai
	int x =sc.nextInt();
	/*if(age>=20) {
		System.out.println("Person is eligible for Campus");
	}
	else{
		System.out.println("Person is not eligible for Campus");
	}*/
    if(x%2==0)
    {
    	System.out.println("Number is Even");
    }
    else 
    {
    	System.out.println("Number is ODD");
    }
}
	
}
