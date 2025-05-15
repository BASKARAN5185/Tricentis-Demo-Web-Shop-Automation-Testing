package testBase;


import E_Commerce.demowebshop.tricentis.com.BaseClass;
import pageObject.RegistrationPage;
import utility.UserDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class RegistrationPageTest extends BaseClass {

    WebDriver driver;
    RegistrationPage registrationPage;

    @BeforeClass
    public void setup() {
        // Set path to ChromeDriver if needed
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/register");  // Replace with actual URL

        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void testValidRegistration() {
        // Fill form using POM methods
        assert registrationPage.selectGenderMale();
        assert registrationPage.enterFirstName("John");
        assert registrationPage.enterLastName("Doe");
        assert registrationPage.enterEmail("john.doe@example.com");
        assert registrationPage.enterPassword("Password123");
        assert registrationPage.enterConfirmPassword("Password123");
        assert registrationPage.clickRegisterButton();

        // TODO: Add assertion to verify success (URL change, success message, etc.)
        // Example:
         Assert.assertTrue(driver.getCurrentUrl().contains("register"),"The Page url not contain 'regisister'");
    }
    

    
    @Test(dataProvider = "Registration", dataProviderClass = UserDataProvider.class)
    public void testValidRegistrationDataDriven(String gender, String firstName, String lastName, String email, String password) {
        if (gender.equalsIgnoreCase("male")) {
            registrationPage.selectGenderMale();
        } else if(gender.equalsIgnoreCase("female")) {
            registrationPage.selectGenderFemale();
        }

        Assert.assertTrue(registrationPage.enterFirstName(firstName));
        Assert.assertTrue(registrationPage.enterLastName(lastName));
        Assert.assertTrue(registrationPage.enterEmail(email));
        Assert.assertTrue(registrationPage.enterPassword(password));
        Assert.assertTrue(registrationPage.enterConfirmPassword(password));
        Assert.assertTrue(registrationPage.clickRegisterButton());

        // Validation after submission
        Assert.assertTrue(driver.getCurrentUrl().contains("registerresult"), "The Page URL does not contain 'registerresult'");
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
