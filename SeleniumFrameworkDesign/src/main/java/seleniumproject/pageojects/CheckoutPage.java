package seleniumproject.pageojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import seleniumproject.abstractComponents.abstractComponents;

public class CheckoutPage extends abstractComponents{
    WebDriver driver;
    
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[placeholder=\\\"Select Country\\\"]")
	private WebElement countryname;
	
	@FindBy(xpath=("(//button[contains(@class,'ta-item')])[2]"))
	private WebElement selectCountry;
	
	@FindBy(xpath=("//a[contains(@class,'btnn action__submit')]"))
	private WebElement checkoutbutton;
	
	By results= By.cssSelector(".ta-results");
	By successmessage=By.cssSelector(".hero-primary");

	public void selectCountry() {
		Actions a=new Actions(driver);
		a.sendKeys(countryname,"India").build().perform();
		waitforElementtoappear(By.cssSelector(".ta-results"));
		selectCountry.click();
	}
	
	public confirmationPage SubmittheOrder() {

		checkoutbutton.click();
		return new confirmationPage(driver);
	}
	
	
}