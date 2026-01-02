package Functions.java;

import java.util.Scanner;

public class calculateEvenOdd {
	
	public static void calculateEvenOdd(int a) {
		if(a%2==0) {
			System.out.print("Even Number");
		}else 
			System.out.print("ODD Number");
		return ;
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int a=sc.nextInt();
      
      System.out.print("The number is:");
      calculateEvenOdd(a);
      
	}

}
