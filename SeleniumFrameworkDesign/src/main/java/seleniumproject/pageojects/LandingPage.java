package seleniumproject.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumproject.abstractComponents.abstractComponents;

public class LandingPage extends abstractComponents{

	WebDriver driver;

	public LandingPage(WebDriver driver) {
      //Initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	//Page factory
	@FindBy(id="userEmail")
	WebElement userEmail ;
	
	@FindBy(id="userPassword")
	WebElement Userpassword;
	
	@FindBy(id="login")
	WebElement Submit;
	
	@FindBy(xpath="//div[@aria-label='Incorrect email or password.']")
	WebElement ErrorValidationmessage;
	
	public productcatalogue LoginApplication(String email, String password ) {
		
		userEmail.sendKeys(email);
		Userpassword.sendKeys(password);
		Submit.click();
		productcatalogue productcatalogue=new productcatalogue(driver);
		return productcatalogue;
		
	}
	
	public String getErrorMessage() {
		waitforWebElementtoappear(ErrorValidationmessage);
		return ErrorValidationmessage.getText();
		
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
	}
	
	
	
	
	
}























