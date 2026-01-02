package Loops.java;

import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //1st pattern
		/*Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       
       for(int i=1;i<=4;i++) {
    	   for(int j=1;j<=5;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println("*");*/
		
		// 2nd pattern 
		/*int n=4;
		int m=5;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=m;j++) {
			
				if(i==1||j==1||i==n||j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println( );*/
		
		//3rd pattern
		/*int n=4;
		
		
		for(int i=n;i<=n;i-- ) {
			for(int j=1;j<i;j++) {
					System.out.print(" ");
				}
			System.out.println("*");*/
		
		//4th pattern
		/*int n=4;
		
		for(int i=1;i<=n;i++) {
			//to print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//to print (*)
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			    System.out.println();*/
		
		
		//5th pattern
		/*int n=5;
		int sum=0;
		
		
		for(int i=5;i<=n;i--) {
			
		 //To print sum
		for(int j=1;j<=i;j++) {
			sum=j;
			System.out.print(sum);
			}
		
		//to print spaces
		
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
			}
		System.out.println();*/
		
		//6th pattern
		/*int n=5;
		int sum=1;
		
		for(int i=0;i<n;i++) {
			//to print numbers
			for(int j=0;j<=i;j++) {
				System.out.print(sum+" ");
				sum++;
			}
			//To print spaces
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();*/
		
		//7th pattern
		
		int n=5;
		int num=1;
		
		for(int i=1;i<=n;i++) {
			
			//to print number
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1"+" ");
				}else
					System.out.print("0"+" ");
			}
			//To print spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");	
				
			}
			System.out.println();
		
		
		}
			
			
	} 
		
   }
    	
	


