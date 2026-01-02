package Arrays.java;

import java.util.Scanner;

public class arraysInAscendingOrder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		boolean isAscending=true;
        
		for(int i=0;i<numbers.length-1;i++) {
			//numbers.length as termination condition
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
		}
	}
	if(isAscending) {
		System.out.println("The array is in ascending order");

	}else {System.out.println("The array is not in ascending order");

}
}
}
