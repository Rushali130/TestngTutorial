package seleniumproject.stepdefination;

import java.io.IOException;

import io.cucumber.java.en.Given;
import seleniumproject.TestComponent.BaseTest;
import seleniumproject.pageojects.LandingPage;

public class stepdefination extends BaseTest {

	public LandingPage LandingPage;

	@Given("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page() throws IOException {

		LandingPage = launchApplication();
	}

	@Given("Logged in with Username (.+) and password (.+)")
	public void Logged_in_with_Username_and_password() {

	}
}