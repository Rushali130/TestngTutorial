package seleniumproject.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumproject.pageojects.CartPage;
import seleniumproject.pageojects.OrderPage;

public class abstractComponents {
	
    WebDriver driver;
	public abstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="button[routerlink=\"/dashboard/cart\"]")
	WebElement elementclick;
	
	@FindBy(css="button[routerlink=\"/dashboard/myorders\"]")
	WebElement Orders;

	public void waitforElementtoappear(By findby) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
}
	
	public void waitforWebElementtoappear(WebElement findby) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findby));
	}
	
	
	public void waitforElementtoInvisible(WebElement InvisibleElement) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(InvisibleElement));
	}
	
	public CartPage cartbuttonclick() {
		elementclick.click();
		CartPage CartPage=new CartPage(driver);
		return CartPage;
	
	}
	
	public OrderPage OrderPageTest() {
		Orders.click();
		OrderPage OrderPage=new OrderPage(driver);
		return OrderPage;
	
	}
	public void scrollingthepage() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
	}
	

	
}