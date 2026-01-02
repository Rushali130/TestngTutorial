package com.methods;

import java.util.Scanner;

public class ToAccessmethodFromOtherClass {

	public int AccessmethodFromOtherClass(){
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		return a+b;
		
	}
	
	
}
