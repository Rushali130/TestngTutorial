package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovideranotation {
	
	
	@Test(dataProvider="getdata")
	public void mobilesignoutCarloan(String username, String password) {
		
		System.out.println("mobilesignoutCarloan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		//1st combination- Username password- good credit history
		//2nd combination-  Username password- no credit history
		//3rd combination-
		Object[][] data=new Object[3][2];
		data[0][0]="Firstusername";
		data[0][1]="Firstpassword";
		
		//2nd data
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
			
		//3rd data
		data[2][0]="Thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
