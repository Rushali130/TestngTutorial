package Practice.java;

import java.util.Scanner;

public class Maxoftwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int n1=sc.nextInt();
	    System.out.println("Enter the Second number");
	    int n2=sc.nextInt();
	    int max = n1>n2?0:1;
	    
	    switch(max) {
	    case 0: System.out.println("n1 is greater than n2");
	    break;
	    case 1: System.out.println("n1 is lesser than n2");
	    }
	    
	    
	}

}
