package seleniumproject.pageojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumproject.abstractComponents.abstractComponents;

public class OrderPage extends abstractComponents{
WebDriver driver;
    
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//tr/td[2]")
    List<WebElement> OrderList;
	
    @FindBy(css=".totalRow button")
	WebElement Checkoutbutton1;
	By Checkoutbutton=By.cssSelector(".totalRow button");
	
	public boolean VerifyorderDisply(String Productname) {

		boolean match=OrderList.stream().anyMatch(cart-> cart.getText().equals(Productname));
		return match;
	}
	

}
