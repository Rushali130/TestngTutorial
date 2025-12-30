package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
			
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I sucessfully excuted all listerner code");	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I sucessfully captured all failed test case screenshots"+ result.getName());	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I sucessfully Skipped test cases"+ result.getName());	
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
		
	}

	
	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	
}
