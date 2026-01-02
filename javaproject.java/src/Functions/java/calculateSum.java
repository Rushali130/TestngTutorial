package Functions.java;

import java.util.Scanner;

public class calculateSum {
	
	public static int calculateSum(int a, int b) {
		//int sum=a+b;
		int sum= a+b;
		System.out.print(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        
        System.out.println("Sumo of two number:");
        int sum= calculateSum(a,b);
	}

}
