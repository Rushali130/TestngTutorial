package seleniumproject.pageojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import seleniumproject.abstractComponents.abstractComponents;

public class productcatalogue extends abstractComponents {

	WebDriver driver;

	public productcatalogue(WebDriver driver) {
		// Initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".col-lg-4")
	List<WebElement> Allproducts;

	@FindBy(css = ".ng-animating")
	WebElement InvisibleElement;

	By productBy = By.cssSelector(".col-lg-4");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastmessage = By.cssSelector("#toast-container");

	public List<WebElement> getproductinList() {

		waitforElementtoappear(productBy);
		return Allproducts;
	}

	public WebElement getproductbyName(String Productname) {
		WebElement Prod = Allproducts.stream()
				.filter(product -> product.findElement(By.tagName("b")).getText().equalsIgnoreCase(Productname))
				.findFirst().orElse(null);
		return Prod;
	}

	public void addproductToCart(String Productname) {

		WebElement Prod = getproductbyName(Productname);
		Prod.findElement(addToCart).click();
		waitforElementtoappear(toastmessage);
		waitforElementtoInvisible(InvisibleElement);

	}

}
