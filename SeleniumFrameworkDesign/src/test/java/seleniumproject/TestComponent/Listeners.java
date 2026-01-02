package seleniumproject.TestComponent;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import seleniumproject.resources.ExtentReportNG;

public class Listeners extends BaseTest implements ITestListener {
    private static final String NULL = null;
	ExtentTest test;
	 ExtentReports extent = ExtentReportNG.getReportObject();
	 ThreadLocal<ExtentTest> extentTest=new ThreadLocal(); //Thread Safe

	 
	 //extentTest me test object store karo and then Get karo vo test object by extenttest.get()
	@Override
	public void onTestStart(ITestResult result) {
     test=extent.createTest(result.getMethod().getMethodName());
     extentTest.set(test); //Unique thread ID 
	}

	
	
	//test = extentTest.get()
	@Override
	public void onTestSuccess(ITestResult result) {

		extentTest.get().log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		extentTest.get().fail(result.getThrowable());
		
		//Give driver to its life from screenshot method
		//Fields are associate with class level not method level
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String filepath = null;
		try {
			filepath = getScreenshots(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.get().addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		//Take screenshots and attach to report
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
       extent.flush();
	}

}
