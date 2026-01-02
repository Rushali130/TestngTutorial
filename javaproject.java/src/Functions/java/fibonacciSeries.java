package Functions.java;

import java.util.Scanner;

public class fibonacciSeries {

	    public static void fibonacciSeries(int n) {
	    	System.out.print(0+" ");
	    	System.out.print(1+" ");
	    	int sum=0;
	    	for(int i=1;i<=n;i++) {
	    		sum=sum+i;
	    		System.out.print(sum+" ");
	    		
	    	} 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        fibonacciSeries(n);
	}

}
