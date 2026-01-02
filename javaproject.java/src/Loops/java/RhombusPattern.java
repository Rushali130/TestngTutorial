package Loops.java;

public class RhombusPattern {

	public static void main(String[] args) {
		
		// Rhombus pattern
		
		
         int n=5;
         
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=n-i;j++) {
                 System.out.print(" ");
        	 }
        	 for(int j=1;j<=n;j++) {
        		 System.out.print("*" );
        	 }System.out.println( );
		
		//Number PYRAMID
		
		/*int n=5;
		int row=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j<=i) {
				System.out.print(row+" ");
				}else
					System.out.print(" ");
			}System.out.println( );
			row++;*/
		
		//Palindrome pyramid
		
		/*int n=5;
		
		for(int i=1;i<=n;i++) {
			//Inner loop to print spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//inner loop to print first part
			for(int j=1;j>=1;j--) {
				System.out.print(j+" ");
			}
				////inner loop to print second part
				for(int j=2;j<=i;j++){
					System.out.print(j+" ");
			}System.out.println( );*/
		}
	}
		}
	

	
		
	
        
	

	

