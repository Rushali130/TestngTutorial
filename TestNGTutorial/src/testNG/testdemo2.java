package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class testdemo2 {
//Home loan
	@Parameters({"URL"})
	@Test
	public void homeloanpage(@Optional("homeloan.com")String urllink) {
		
		System.out.println("Hello");
		System.out.println(urllink);
	}
	
	@Test(groups= {"Regression"})
	public void Mobileloginpage() {
		
		System.out.println("rajmi");
	}
	@Parameters({"URL","key"})
	@Test
	public void Mobileloginpagerename(@Optional("homeloan.com")String urllink,@Optional("12345679") String key) {
		
		System.out.println("Ruscfvghhali");
		System.out.println(urllink);
		System.out.println(key);
	}
	
	@Test(enabled=false)
	public void enabledtestcase() {
		System.out.println("Test case for Enabled concepts");
		
	}
	
}
