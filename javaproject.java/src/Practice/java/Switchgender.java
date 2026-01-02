package Practice.java;

import java.util.Scanner;

public class Switchgender {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gender");
        char gender=sc.next().charAt(0);
        
        switch(gender) {
        case 'M':
        case 'm': System.out.println("MALE");
        break;
        case 'F':
        case 'f': System.out.println("FEMALE");
        break;
        
        }
	}

}
