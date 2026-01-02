package Functions.java;

import java.util.Scanner;

public class printOddNumber {
	
	public static void printSumOfOddNumber(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			sum=sum+i;
			}
		}System.out.print(sum);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         System.out.println("The sum of ODD number is:");
         printSumOfOddNumber(n);
         
	}

}
