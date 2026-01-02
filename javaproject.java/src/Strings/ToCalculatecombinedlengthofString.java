package Strings;

import java.util.Scanner;

public class ToCalculatecombinedlengthofString {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String name[]=new String[size];
		int Totallength=0;
		
		for(int i=0;i<size;i++) {
			name[i]=sc.next();
			Totallength =name[i].length();
		}
		System.out.print(Totallength);
	
	}

}
