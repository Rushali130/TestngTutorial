package seleniumproject.extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportDemo {
	ExtentReports extent;
	@BeforeTest
	public void Config() {
	//ExtentReports , ExtentSparkReporter  are imp class to create extent reports.
		String path=System.getProperty("user.dir")+"\\reports\\index1.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setReportName("Web Automation Result");
		Reporter.config().setDocumentTitle("Test results");
		
		extent=new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Tester", "Rushali Modak");
		
	}
	
	@Test
	public void initialDemo() {
		//extent.createTest("Initial DEMO");
		ExtentTest test=extent.createTest("Initial DEMO");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RMODAK\\eclipse-workspace New\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Result do not found");
		extent.flush();
	}
}
