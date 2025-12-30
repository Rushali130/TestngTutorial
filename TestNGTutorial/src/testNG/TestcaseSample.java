package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public  class TestcaseSample {
	
	@BeforeMethod
	public void Method() {
		
		System.out.println("before method");
	}
	
	@Test(dependsOnMethods= {"Testprint"})
	public void Testcase() {
		
		System.out.println("Hello");
	}
	
	@Test(timeOut=4000)
	public void Testprint() {
		
		System.out.println("Rushali");
		Assert.assertTrue(false);
	}
	@BeforeSuite
	public void bfsuite() {
		
		System.out.println("I am before suite");
	}
	
	@AfterTest
	public void Testdemo() {
		
		System.out.println("after test ");
	
	}
	@AfterMethod
	public void Afmethod() {
		
		System.out.println("After method");
	}
	
	@BeforeClass
	public void BFClass() {
		
		System.out.println("before class");
	}
	@AfterClass
	public void AFClass() {
		
		System.out.println("After class");
	}
	
}

