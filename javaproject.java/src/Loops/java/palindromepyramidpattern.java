package Loops.java;

import java.util.*;

public class palindromepyramidpattern {
	
	private static void printpattern(int n) {
		int i,j;
		
		for( i=1;i<=n;i++) {
			//Inner loop to print spaces
			for( j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//inner loop to print first part
			for( j=1;j>=1;j--) {
				System.out.print(j+" ");
			}
				////inner loop to print second part
				for( j=2;j<=i;j++){
					System.out.print(j+" ");
			}System.out.println( );
		}
	}
		
		public static void main(String[] args) {
			int n=5;
			printpattern(n);
	}
}

