package Strings;

import java.util.Scanner;

public class stringsMethods {

	public static void main(String[] args) {
		
		String firstname="Rushali";
		String lastname="Modak";
		String fullname=firstname + " " +lastname;
		
		System.out.println(fullname);
		System.out.println(fullname.length());
		
		for(int i=0;i<fullname.length();i++) {
			System.out.print(fullname.charAt(i)+" ");
		}

	}

}
