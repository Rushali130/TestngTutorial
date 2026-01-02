package com.AdvancedPattern;

public class Butterflypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*int n=4;
         
         for(int i=1;i<=n;i++) {
        	 
        	 // 1st part of Stars
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("*"+" ");
        	 }
        	 //Spaces
        	 for(int j=1;j<=2*(n-i);j++) {
        		 System.out.print(" "+" ");
        	 }
        	 //2nd part of star
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("*"+" ");
         }System.out.println(" ");
	}
         //Lower part 
         for(int i=4;i>=1;i--) {
        	 for(int j=i;j>=1;j--) {
        		 System.out.print("*"+" ");
        	 }
        	//lower part spaces
        	 for(int j=1;j<=2*(n-i);j++) {
        		 System.out.print(" "+" ");
         }
        	 
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("*"+" ");
        	 }
        	 System.out.println( );
}
}
}*/



      //Hollow butterfly
		int n=4;
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*"+" ");
			}else
				System.out.print(" "+" ");
			}
			
			//Upper part spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*"+" ");
			}else 
				System.out.print(" "+" ");
          } 
			System.out.println( );
		}
		//Lower part of butterfly
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1||i==j) {
					System.out.print("*"+" ");
			}else
				System.out.print(" "+" ");
			}
			
			//Upper part spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("*"+" ");
			}else
				System.out.print(" "+" ");
		}System.out.println( );
	}
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

