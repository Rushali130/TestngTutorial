package javaproject.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int button=sc.nextInt();
      
      switch(button) {
      case 1: System.out.println("Hello");
      break;
      
      case 2: System.out.println("Namaste");
      break;
      
      case 3: System.out.println("Boujour");
      break;
      
      default: System.out.println("Invalid button");
      }
      
	}

}
