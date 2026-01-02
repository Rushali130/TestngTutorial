package com.collections;

import java.util.ArrayList;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {4,5,5,5,6,4,9,2,6};
         
         
        ArrayList<Integer> sb=new ArrayList<Integer>();
        
        for(int i=0;i<a.length;i++)
        {
        int k=0;
        if(!sb.contains(a[i])) 
        {
        	sb.add(a[i]);
        	k++;
        	
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) 
        		{
        			k++;
        		}
        	}
        	System.out.println(a[i]);
            System.out.println(k);
        }
        if(k==1) {
        	System.out.println(a[i]+"is unique number");
        }
	}

}
}
