package com.BitManipulation;

import java.util.Scanner;

public class bitManipulationMethod {

	public static void main(String arg[]) {
		//Get Bit method step1: Bitmask=1<<pos and step 2: AND
		
		
//		int n=5;
//		int pos=3;
//		int bitmask=1<<pos;
//		if((bitmask & n)==0) {
//			System.out.print("bit was zero");
//		}else {
//			System.out.print("bit was not zero");
		
		//SET bit Method  step1: Bitmask=1<<pos and step 2: OR
		
		
//		int n=7;
//    	int pos=1;
//		int bitmask=1<<pos;
//		int newNumber=bitmask | n;
//		System.out.print(newNumber);
		
		//CLEAR bit method   step1: Bitmask=1<<pos and step 2: AND with NOT Bitmask
		
		
//		int n=5;
//    	int pos=2;
//		int bitmask=1<<pos;
//		int notbitmask=~(bitmask);
//		int newNumber=notbitmask & n;
//		System.out.print(newNumber);
		
		//Update the Bit Method
		//for oper 0: step1: Bitmask=1<<pos and step 2: AND with NOT
		//for oper 1: step1: Bitmask=1<<pos and step 2: OR
		
		Scanner sc=new Scanner(System.in);
		int oper=sc.nextInt();
		int n=5 ;
		int pos=1 ;
		int bitmask=1<<pos;
		
		if(oper==1) {
			int newnumber=bitmask | n;
			System.out.print(newnumber);
		}else {
			int notbitmask=~(bitmask);
			int newnumber=notbitmask & n;
			System.out.print(newnumber);
		}
		
		
		}	
	}

