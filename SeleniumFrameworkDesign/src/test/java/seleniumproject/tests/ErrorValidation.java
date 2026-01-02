package seleniumproject.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumproject.TestComponent.BaseTest;
import seleniumproject.TestComponent.RetryListener;
import seleniumproject.pageojects.CartPage;
import seleniumproject.pageojects.productcatalogue;

public class ErrorValidation extends BaseTest {

	@Test(groups= {"errorvalidation"}, retryAnalyzer=RetryListener.class)
	public void loginErrorValidation() throws IOException {

		String Productname = "ZARA COAT 3";
		String email = "rushali@gmail.com";
		String password = "Magnet123";
		LandingPage.LoginApplication("rushali@gmail.com", "Magnet1234");
		Assert.assertEquals("Incorrect email password.", LandingPage.getErrorMessage());

	}
	
	 @Test
	  public void productErrorValidation() throws IOException {

		String Productname="ZARA COAT 3";
		//String email="rushali@gmail.com";
		//String password="Magnet123";
		
		//LandingPage LandingPage=launchApplication();
		productcatalogue productcatalogue=LandingPage.LoginApplication("rushali@gmail.com" , "Magnet123");
		
		List<WebElement>Allproducts= productcatalogue.getproductinList();
		productcatalogue.addproductToCart(Productname);
		CartPage CartPage=productcatalogue.cartbuttonclick();
		
		boolean match=CartPage.getItemsInCart(Productname); 
		Assert.assertTrue(match);
}
}
