package Arrays.java;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		
		//Method 1: Creating a array with new keyword
		/*int marks[]=new int[3];
		marks[0]=87;
		marks[1]=97;
		marks[2]=47;
		
		for(int i=0;i<3;i++) {
		System.out.println(marks[i]);*/
	
		//Method 2; Creating array 
		
		/*int marks[]= {87,98,45};
		
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);*/
		
		
		//Method 3: Taking array as input and print its element
		
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int numbers[]=new int[n];
		
		//To take input
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		//To give Output
		for(int i=0;i<n;i++) {
			System.out.println(numbers[i]);*/
			
			//Method 4: Taking array as input name and print string 
			
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			String names[]=new String[size];
			
			//To take input
			for(int i=0;i<size;i++) {
				names[i]=sc.next();
			}
			//To give Output
			for(int i=0;i<size;i++) {
				System.out.println(names[i]);
	}
}
}
