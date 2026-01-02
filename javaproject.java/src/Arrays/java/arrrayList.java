package Arrays.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //is you want access any method present in class then u need to create object of that class
		ArrayList<String> ab= new ArrayList<String>();
		ab.add("Rushali");
		ab.add("Sakshi");
		ab.add("Selenium");
		ab.add("Modak");
		System.out.println(ab.get(3));
		
		//Difference between array and arraylist 
		//array --> we have static size of element 
		//but arraylist --> we can dynamically grow with size 
		
		//if you want to check string present in ur arraylist then
		//1. convert into arraylist and apply contains method
		
		String name[]= {"Rushali","sakshi","selenium","academy"};
		List <String> nameArrayList= Arrays.asList(name);
		System.out.println(nameArrayList.contains("academy"));
		
		//What is String in java
		//String is object that represents sequence of char
		//String literals
		
		String s= "Rushali modak academy";
		String s1= "Rushali modak academy ";   //s==s1 bcoz strings are same
		
		//string with new oper
		String s2= new String("Rushali modak");
		String s3= new String("Rushali modak");  //s2 and s3 are different
		
		//if you want to split the string , use split method 
		String[] SplittedString = s.split("modak ");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[1].trim());
		
		
		
		
		
		
		
	}

}
