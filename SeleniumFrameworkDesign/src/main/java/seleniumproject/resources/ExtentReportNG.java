package seleniumproject.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public static ExtentReports getReportObject() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index2.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setReportName("Web Automation Result");
		Reporter.config().setDocumentTitle("Test results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Tester", "Rushali Modak");
		return extent;
	}
}
