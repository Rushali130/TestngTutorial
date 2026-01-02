package com.exceptionhandling;

// One try can be followed by multiple catc block 
// catch block should be an immediate block after try
public class exceptiondemo{
	
    int a=6;
	int b=0;
	
	public static void main(String[] args) {
		int a=6;
		int b=0;
		try {
			//int k=a/b;
			int arr[]=new int[6];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e)
		{
			//This is arithmetic exception catch 
			System.out.println("I catched the arithmetic exception error");
		}
		catch(IndexOutOfBoundsException er) {
			System.out.println("I catched the IndexOutOfBoundsException error");
			
			
		}
		catch(Exception et) {
			// this is parent class , it will cover all exception in this catch 
			System.out.println("I catched the exception error");
		}
		finally{
			//This block executed irrespective of execution thrown or not
			//Even script fails or pass this will exccute 
			//Even if catch block is not there , finally block will execute 
			System.out.println("Delete cookies");
		}
	}
	
	//One way to stop execution of finally block 
	//When you are trying to stop execution forcefully by clicking in red button on console 
	
	
}