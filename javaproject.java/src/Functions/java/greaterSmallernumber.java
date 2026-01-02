package Functions.java;

import java.util.Scanner;

public class greaterSmallernumber {
	
	public static void calculateGreaterSmaller(int a,int b) {
		
		if(a>b) {
			System.out.print("The greater number is:"+ a);
			//return a;
		}else 
			System.out.print("The greater number is:"+ b);
			//return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       
       //System.out.println("Enter the number:");
       calculateGreaterSmaller(a,b);
       
       
	}

}
