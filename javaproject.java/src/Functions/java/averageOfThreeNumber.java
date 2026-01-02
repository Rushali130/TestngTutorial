package Functions.java;

import java.util.Scanner;

public class averageOfThreeNumber {

	public static void averageOfThreeNumber(int a, int b, int c) {
		float avg=(a+b+c)/3;
		System.out.println("The average of 3 no is :"+ avg);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the first number");
          int a=sc.nextInt();
          System.out.println("Enter the Second number");
          int b=sc.nextInt();
          System.out.println("Enter the Third number");
          int c=sc.nextInt();
          
          
          averageOfThreeNumber(a,b,c);
          
	}

}
