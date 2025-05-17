package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import E_Commerce.demowebshop.tricentis.com.BaseClass;
import pageObject.HomePage;

public class HomePageTest extends BaseClass {

	HomePage homePage = new HomePage(driver);

	// --- Logo and Navigation Tests ---
	@Test(priority = 1)
	public void testLogoIsDisplayed() {
		Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");
	}

	@Test(priority = 2)
	public void testRegisterLinkNavigation() {
		homePage.clickRegister();
		Assert.assertTrue(driver.getTitle().contains("Register"), "Not navigated to Register page");
	}

	@Test(priority = 3)
	public void testLoginLinkNavigation() {
		homePage.clickLogin();
		Assert.assertTrue(driver.getTitle().contains("Login"), "Not navigated to Login page");
	}

	@Test(priority = 4)
	public void testShoppingCartLinkNavigation() {
		homePage.clickShoppingCart();
		Assert.assertTrue(driver.getTitle().contains("Shopping Cart"), "Not navigated to Shopping Cart page");
	}

	@Test(priority = 5)
	public void testWishlistLinkNavigation() {
		homePage.clickWishlist();
		Assert.assertTrue(driver.getTitle().contains("Wishlist"), "Not navigated to Wishlist page");
	}

	// --- Cart, Wishlist, and Flyout Tests ---
	@Test(priority = 6)
	public void testCartQuantity() {
		String cartQuantity = homePage.getCartQuantity();
		Assert.assertNotNull(cartQuantity, "Cart quantity is not displayed");
	}

	@Test(priority = 7)
	public void testWishlistQuantity() {
		String wishlistQuantity = homePage.getWishlistQuantity();
		Assert.assertNotNull(wishlistQuantity, "Wishlist quantity is not displayed");
	}

	@Test(priority = 8)
	public void testFlyoutCartMessage() {
		String cartMessage = homePage.getFlyoutCartMessage();
		Assert.assertTrue(cartMessage.contains("no items") || cartMessage.contains("items"), "Unexpected cart message");
	}

	// --- Search Functionality ---
	@Test(priority = 9)
	public void testSearchFunctionality() {
		homePage.enterSearchText("laptop");
		homePage.clickSearchButton();
		Assert.assertTrue(driver.getTitle().contains("Search"), "Search did not execute");
	}

	// --- Main Menu and Category Navigation Tests ---
	@Test(priority = 10)
	public void testMainMenuNavigationBooks() {
		Assert.assertTrue(homePage.clickMainMenuByText("Books"), "Failed to click on Books menu");
		Assert.assertTrue(driver.getCurrentUrl().contains("/books"), "Books URL not loaded");
	}

	@Test(priority = 11)
	public void testMainMenuNavigationElectronics() {
		Assert.assertTrue(homePage.clickMainMenuByText("Electronics"), "Failed to click on Electronics menu");
		Assert.assertTrue(driver.getCurrentUrl().contains("/electronics"), "Electronics URL not loaded");
	}

	@Test(priority = 12)
	public void testSubMenuNavigationNotebooks() {
		homePage.clickMainMenuByText("Computers");
		homePage.clickNotebooksSubmenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("/notebooks"), "Notebooks page not loaded");
	}

	@Test(priority = 13)
	public void testSubMenuNavigationPhones() {
		homePage.clickMainMenuByText("Electronics");
		homePage.clickPhonesSubmenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("/phones"), "Phones page not loaded");
	}

	// --- Category Navigation Tests ---
	@Test(priority = 14)
	public void testCategoryNavigationBooks() {
		homePage.clickBooksCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/books"), "Books category page not loaded");
	}

	@Test(priority = 15)
	public void testCategoryNavigationComputers() {
		homePage.clickComputersCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/computers"), "Computers category page not loaded");
	}

	@Test(priority = 16)
	public void testCategoryNavigationElectronics() {
		homePage.clickElectronicsCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/electronics"), "Electronics category page not loaded");
	}

	@Test(priority = 17)
	public void testCategoryNavigationApparel() {
		homePage.clickApparelCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/apparel"), "Apparel category page not loaded");
	}

	@Test(priority = 18)
	public void testCategoryNavigationDownloads() {
		homePage.clickDownloadsCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/downloads"), "Downloads category page not loaded");
	}

	@Test(priority = 19)
	public void testCategoryNavigationJewelry() {
		homePage.clickJewelryCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/jewelry"), "Jewelry category page not loaded");
	}

	@Test(priority = 20)
	public void testCategoryNavigationGiftCards() {
		homePage.clickGiftCardsCategory();
		Assert.assertTrue(driver.getCurrentUrl().contains("/gift-cards"), "Gift Cards category page not loaded");
	}

	// --- Newsletter Subscription Tests ---
	@Test(priority = 21)
	public void testNewsletterSubscriptionInvalid() {
		homePage.enterNewsletterEmail("invalidemail");
		homePage.clickSubscribe();
		String result = homePage.getNewsletterResultMessage();
		Assert.assertTrue(result.toLowerCase().contains("enter") || result.toLowerCase().contains("valid"),
				"Invalid email error not shown");
	}

	// --- Manufacturer Navigation Test ---
	@Test(priority = 22)
	public void testManufacturerNavigation() {
		homePage.clickTricentisManufacturer();
		Assert.assertTrue(driver.getCurrentUrl().contains("tricentis"), "Tricentis manufacturer page not loaded");
	}

	// --- Loading Indicator Test ---
	@Test(priority = 23)
	public void testLoadingIndicator() {
		Assert.assertTrue(homePage.isLoadingIndicatorVisible(), "Loading indicator is not visible");
	}

}
