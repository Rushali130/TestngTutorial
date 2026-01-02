package Practice.java;

import java.util.*;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number");
         float a=sc.nextFloat();
         System.out.println("Enter the second number");
         int b=sc.nextInt();
        
         
         //int result=sc.nextInt();
         System.out.println("Enter the operator");
         char op=sc.next().charAt(0);
         //int result=0;
         switch(op) {
         case '+': 
        	 //result=a+b;
        	 System.out.println(a+b);
         break;
         case '-':
        	 //result=a-b;
        	 System.out.println(a-b);
         break;
         case '*':
        	 //result=a*b;
        	 System.out.println(a*b);
         break;
         case '/':
        	// result=a/b;
        	 System.out.println(a/b);
         break;
         case '%':
        	// result=a%b;
        	 System.out.println(a%b);
         break;
         }
         
         
	}

}
