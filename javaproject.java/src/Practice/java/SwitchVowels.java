package Practice.java;

import java.util.*;

public class SwitchVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the alphabet");
       char A=sc.next().charAt(0);
       
       if((A>='A' && A<='Z')||(A>='a' && A<='z')) {
       switch(A) {
       case 'a','e','i','o','u':
       case 'A','E','I','O','U': System.out.println("This is Vowels");
       break;
       default:
    	   System.out.println("This is consonant");
    	   break;
       }
       }else {
    	   System.out.println("This is not alphabet");
       }
    
	}
}


