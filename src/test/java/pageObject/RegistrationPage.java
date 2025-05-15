package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import E_Commerce.demowebshop.tricentis.com.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage(WebDriver driver) {
		BaseClass.driver = driver;
	}

	// ==== Gender ====
	By genderMaleRadio = By.id("gender-male");
	By genderFemaleRadio = By.id("gender-female");

	// ==== Personal Details ====
	By firstNameField = By.id("FirstName");
	By lastNameField = By.id("LastName");
	By emailField = By.id("Email");

	// ==== Password Fields ====
	By passwordField = By.id("Password");
	By confirmPasswordField = By.id("ConfirmPassword");

	// ==== Submit Button ====
	By registerButton = By.id("register-button");

	// ==== Error Message Selectors ====
	By firstNameError = By.cssSelector("[data-valmsg-for='FirstName']");
	By lastNameError = By.cssSelector("[data-valmsg-for='LastName']");
	By emailError = By.cssSelector("[data-valmsg-for='Email']");
	By passwordError = By.cssSelector("[data-valmsg-for='Password']");
	By confirmPasswordError = By.cssSelector("[data-valmsg-for='ConfirmPassword']");

	// ======= Locator Accessor Methods =======

	public By getFirstNameField() {
		return firstNameField;
	}

	public By getEmailError() {
		return emailError;
	}

	// ======= Action Methods (Return boolean) =======

	public boolean selectGenderMale() {
		driver.findElement(genderMaleRadio).click();
		return true;
	}

	public boolean selectGenderFemale() {
		driver.findElement(genderFemaleRadio).click();
		return true;
	}

	public boolean enterFirstName(String firstName) {
		driver.findElement(firstNameField).clear();
		driver.findElement(firstNameField).sendKeys(firstName);
		return true;
	}

	public boolean enterLastName(String lastName) {
		driver.findElement(lastNameField).clear();
		driver.findElement(lastNameField).sendKeys(lastName);
		return true;
	}

	public boolean enterEmail(String email) {
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(email);
		return true;
	}

	public boolean enterPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
		return true;
	}

	public boolean enterConfirmPassword(String confirmPassword) {
		driver.findElement(confirmPasswordField).clear();
		driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
		return true;
	}

	public boolean clickRegisterButton() {
		driver.findElement(registerButton).click();
		return true;
	}
}
