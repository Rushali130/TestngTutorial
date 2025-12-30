package testNGUsage;

import org.testng.annotations.BeforeMethod;

public class PS1 {

	
	public void dothis() {
		
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforerun() {
		
		System.out.println("I will run before");
	}
}
