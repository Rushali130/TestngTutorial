package seleniumproject.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumproject.pageojects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage LandingPage;

	public WebDriver InitializeDriver() throws IOException {

		// Properties class --> it will run all global properties
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\seleniumproject\\resources\\GlobalData.properties"); // --> We used
																							// fileinputstream class in
																							// java to use properties
																							// file
		prop.load(file);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox code
		} else if (browserName.equalsIgnoreCase("edge")) {
			// edge code
			System.setProperty("WedDriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	
	//Read data from JSON
	//Data reader method
public List<HashMap<String, String>> getJsondataToMap(String filepath) throws IOException {
		
		//Read Json to String
		String JsonContent=FileUtils.readFileToString(new File(filepath),  
				StandardCharsets.UTF_8);
	// Convert String JsonContent into HashMap for which we need Jackson dependecies
	
		//String to Hashmap
		ObjectMapper mapper= new ObjectMapper();
		List<HashMap<String , String>> data= mapper.readValue(JsonContent, new TypeReference<List<HashMap<String , String>>>(){
	
	});
		return data;
	}


 //How to take screenshots from utility
public String getScreenshots(String Testcasename, WebDriver driver) throws IOException {
	TakesScreenshot Ts=(TakesScreenshot)driver;
	File source=Ts.getScreenshotAs(OutputType.FILE);
	File file= new File(System.getProperty("user.dir")+"//Reports//"+ Testcasename + ".png");
	FileUtils.copyFile(source, file);
	return System.getProperty("user.dir")+"//Reports//"+ Testcasename + ".png";
}

	@BeforeMethod(alwaysRun = true)
	public LandingPage launchApplication() throws IOException {
		driver = InitializeDriver();
		LandingPage = new LandingPage(driver);
		LandingPage.goTo();
		return LandingPage;
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}

}