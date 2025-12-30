package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testdemo3 {
//Car loan
	@Test(groups = { "Regression" })
	public void Testcase() {

		System.out.println("alka");
	}

	@Parameters({"URL"})
	@Test
	public void Testprint(@Optional("https://default.com") String urlname) {

		System.out.println("padmakr");
		System.out.println(urlname);
	}

}
