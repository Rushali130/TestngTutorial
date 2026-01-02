package seleniumproject.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumproject.TestComponent.BaseTest;
import seleniumproject.pageojects.CartPage;
import seleniumproject.pageojects.CheckoutPage;
import seleniumproject.pageojects.LandingPage;
import seleniumproject.pageojects.OrderPage;
import seleniumproject.pageojects.confirmationPage;
import seleniumproject.pageojects.productcatalogue;

public class Loginpage extends BaseTest{
	String Productname="ZARA COAT 3";
	
	  @Test(dataProvider="getdata1", groups={"Purchase"})
	  public void submitOrder( HashMap<String,String> input) throws IOException {

	//	String Productname="ZARA COAT 3";
		//String email="rushali@gmail.com";
		//String password="Magnet123";
//      WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		LandingPage LandingPage=new LandingPage(driver);
//		LandingPage.goTo();
		
		//LandingPage LandingPage=launchApplication();
		productcatalogue productcatalogue=LandingPage.LoginApplication(input.get("email") , input.get("password"));
		
		List<WebElement>Allproducts= productcatalogue.getproductinList();
		productcatalogue.addproductToCart(input.get("Productname"));
		CartPage CartPage=productcatalogue.cartbuttonclick();
		
		boolean match=CartPage.getItemsInCart(input.get("Productname")); 
		Assert.assertTrue(match);
		CheckoutPage CheckoutPage=CartPage.gotoCheckOutPage();
		CheckoutPage.selectCountry();
		confirmationPage confirmmessage=CheckoutPage.SubmittheOrder();

		String confirmation= confirmmessage.Getconfirmmessage();
		Assert.assertTrue(confirmation.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		//driver.close();
		
	}
	  
	/*  @Test(dependsOnMethods={"submitOrder"})
	  public void orderHistoryTest() {
		  //Submit order test will run first and it will check for Order History test 
		  productcatalogue productcatalogue=LandingPage.LoginApplication("rushali@gmail.com" , "Magnet123");
		  OrderPage OrderPage=productcatalogue.OrderPageTest();
		  Assert.assertTrue(OrderPage.VerifyorderDisply(Productname));
		  
	  }*/
	  //If you want to provide data in your test 
	 /*@DataProvider
	  public Object[][] getdata() {
		  return new Object[][] {{"rushali@gmail.com","Magnet123","ZARA COAT 3"} , {"modak@gmail.com", "Magnet@123","Adidas Original"}};
	  }*/
	
	//If you want to provide big set of data in test
	  @DataProvider
	  public Object[][] getdata1() throws IOException {
		  
		  List<HashMap<String, String>> data= getJsondataToMap(System.getProperty("user.dir") + "\\src\\test\\java\\seleniumproject\\data\\PurchaseOrder.json");
		  return new Object[][] {{data.get(0)} , {data.get(1)}};
		  
	  }
}
