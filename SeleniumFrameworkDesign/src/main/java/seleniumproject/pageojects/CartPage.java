package seleniumproject.pageojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import seleniumproject.abstractComponents.abstractComponents;

public class CartPage extends abstractComponents{
    WebDriver driver;
    
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".cartSection h3")
    List<WebElement> cartItems;
	
    @FindBy(css=".totalRow button")
	WebElement Checkoutbutton1;
	By Checkoutbutton=By.cssSelector(".totalRow button");
	
	public boolean getItemsInCart(String Productname) {

		boolean match=cartItems.stream().anyMatch(cart-> cart.getText().equals(Productname));
		return match;
	}
	
	public CheckoutPage gotoCheckOutPage() {
		scrollingthepage();
		waitforElementtoappear(Checkoutbutton);
		Checkoutbutton1.click();
		CheckoutPage CheckoutPage=new CheckoutPage(driver);
		return new CheckoutPage(driver);
	}

	
}