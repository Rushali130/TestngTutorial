package seleniumproject.stepdefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumproject.TestComponent.BaseTest;
import seleniumproject.pageojects.CartPage;
import seleniumproject.pageojects.CheckoutPage;
import seleniumproject.pageojects.LandingPage;
import seleniumproject.pageojects.confirmationPage;
import seleniumproject.pageojects.productcatalogue;

public class stepdefination extends BaseTest {

	public LandingPage LandingPage;
	public productcatalogue productcatalogue;
	public CartPage CartPage;
	public confirmationPage confirmmessage;
	public CheckoutPage CheckoutPage;

	@Given("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page() throws IOException {

		LandingPage = launchApplication();
	}

	@Given("^Logged in with Username (.+) and password (.+)$")
	public void Logged_in_with_Username_and_password(String username, String password) {
		productcatalogue = LandingPage.LoginApplication(username, password);
	}

	@When("^I add (.+) to cart$")
	public void I_add_to_cart(String Productname) {
		List<WebElement> Allproducts = productcatalogue.getproductinList();
		productcatalogue.addproductToCart(Productname);
	}

	@When("^Checkout (.+) and submit the order$")
	public void Checkout_and_submit_the_order(String Productname) {
		CartPage = productcatalogue.cartbuttonclick();

		boolean match = CartPage.getItemsInCart(Productname);
		Assert.assertTrue(match);
		CheckoutPage = CartPage.gotoCheckOutPage();
		CheckoutPage.selectCountry();
		confirmmessage = CheckoutPage.SubmittheOrder();

	}
	
	@Then("{string} message is displayed on ConfirmationPage")
	public void message_is_displayed_on_ConfirmationPage(String string) {
		String confirmation= confirmmessage.Getconfirmmessage();
		Assert.assertTrue(confirmation.equalsIgnoreCase(string));
	}
}
