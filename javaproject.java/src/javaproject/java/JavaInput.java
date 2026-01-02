package javaproject.java;

import java.util.*;

public class JavaInput {

	public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		int radius =sc.nextInt();
		int area= 2*(radius*radius);
		//String name=sc.nextLine();
		//int sum= a+b;
		System.out.println(area);
		if(area>=200) 
		{
			System.out.println("Plot is good");
		} 
		else 
		{
			System.out.println("Plot is not good");
		}
		
	}
}