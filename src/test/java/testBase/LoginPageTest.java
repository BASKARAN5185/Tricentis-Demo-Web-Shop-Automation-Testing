package testBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import E_Commerce.demowebshop.tricentis.com.BaseClass;
import pageObject.LoginPage;
import utility.UserDataProvider;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;

	@BeforeMethod
	public void initialize() {
		loginPage = new LoginPage(driver);
	}

	@Test(dataProvider = "loginData", dataProviderClass = UserDataProvider.class)
	public void loginTest(String username, String password, String expectedResult) {
		loginPage.login(username, password);
		
	}

}
