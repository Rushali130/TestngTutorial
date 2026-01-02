package seleniumproject.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumproject.abstractComponents.abstractComponents;

public class confirmationPage extends abstractComponents{
WebDriver driver;
    
	public confirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".hero-primary")
	WebElement confirmmessage;
	
	public String Getconfirmmessage() {
		return confirmmessage.getText();
		
	}
}
