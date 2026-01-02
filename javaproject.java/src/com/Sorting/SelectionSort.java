package com.Sorting;

public class SelectionSort {
	public static void Selectionsortarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {43,10,3,1,0};
		
       for(int i=0;i<arr.length-1;i++) {
    	   int smallest=i;
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[smallest]>arr[j]) {
    			   smallest=j;
    			   //Swap
    			   
    			   int temp=arr[smallest];
    			   arr[smallest]=arr[i];
    			   arr[i]=temp;
    			  
    		   }
    	   }
       }
       Selectionsortarray(arr);
	}

}
