package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testdemo {
//Personal loan
	@AfterSuite
	public void Afsuite() {
		
		System.out.println("after suite");
	}
	@Test
	public void Testcase() {
		
		System.out.println("Heyyyy");
	}
	
	@Test
	public void Testprint() {
		
		System.out.println("Sakshi");
	}
	
	@BeforeTest
	public void Testprintcase() {
		
		System.out.println("before test");
	}
	
	
}
