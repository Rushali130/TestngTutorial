package Practice.java;

import java.util.*;

public class SwitchEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age");
       int age=sc.nextInt();
       int res = age >= 20?1:0;
       
       switch(res) {
       case 0: 
    	   System.out.println("This is eligible");
       break;
       case 1: 
    	   System.out.println("This is not eligible");
       break;
     }
       
	}

}

