package pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import E_Commerce.demowebshop.tricentis.com.BaseClass;

@SuppressWarnings("deprecation")

public class HomePage extends BaseClass {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		BaseClass.driver = driver;
	}

	// ===========================
	// ========== Locators =======
	// ===========================

	// --- Header / Common Elements ---
	private final By logoImage = By.cssSelector(".header-logo img");
	private final By registerLink = By.cssSelector("a.ico-register");
	private final By loginLink = By.cssSelector("a.ico-login");
	private final By shoppingCartLink = By.cssSelector("a.ico-cart");
	private final By wishlistLink = By.cssSelector("a.ico-wishlist");
	private final By cartQuantity = By.cssSelector(".cart-qty");
	private final By wishlistQuantity = By.cssSelector(".wishlist-qty");
	private final By flyoutCartMessage = By.cssSelector(".flyout-cart .count");

	// --- Search Bar ---
	private final By searchInputField = By.id("small-searchterms");
	private final By searchButton = By.cssSelector(".search-box-button");

	// --- Selectors (dropdowns) ---
	@SuppressWarnings("unused")
	private final By taxSelector = By.cssSelector(".tax-display-type-selector");
	@SuppressWarnings("unused")
	private final By currencySelector = By.cssSelector(".currency-selector");
	@SuppressWarnings("unused")
	private final By languageSelector = By.cssSelector(".language-selector");

	// =============================s
	// ========== Top Menu =========
	// =============================

	private final By allMainMenuLinks = By.cssSelector("ul.top-menu > li > a");

	// Specific Menus
	private final By booksMenu = By.cssSelector("ul.top-menu > li > a[href='/books']");
	private final By computersMenu = By.cssSelector("ul.top-menu > li > a[href='/computers']");
	private final By electronicsMenu = By.cssSelector("ul.top-menu > li > a[href='/electronics']");
	private final By apparelMenu = By.cssSelector("ul.top-menu > li > a[href='/apparel-shoes']");
	private final By downloadsMenu = By.cssSelector("ul.top-menu > li > a[href='/digital-downloads']");
	private final By jewelryMenu = By.cssSelector("ul.top-menu > li > a[href='/jewelry']");
	private final By giftCardsMenu = By.cssSelector("ul.top-menu > li > a[href='/gift-cards']");

	// Submenus
	private final By desktopsSubmenu = By.cssSelector("ul.top-menu a[href='/desktops']");
	private final By notebooksSubmenu = By.cssSelector("ul.top-menu a[href='/notebooks']");
	private final By accessoriesSubmenu = By.cssSelector("ul.top-menu a[href='/accessories']");
	private final By cameraSubmenu = By.cssSelector("ul.top-menu a[href='/camera-photo']");
	private final By phonesSubmenu = By.cssSelector("ul.top-menu a[href='/cell-phones']");

	// =============================
	// ======= Left Sidebar ========
	// =============================

	// Categories
	private final By categoryList = By.cssSelector(".block-category-navigation ul.list > li");
	private final By booksCategory = By.cssSelector(".block-category-navigation a[href='/books']");
	private final By computersCategory = By.cssSelector(".block-category-navigation a[href='/computers']");
	private final By electronicsCategory = By.cssSelector(".block-category-navigation a[href='/electronics']");
	private final By apparelCategory = By.cssSelector(".block-category-navigation a[href='/apparel-shoes']");
	private final By downloadsCategory = By.cssSelector(".block-category-navigation a[href='/digital-downloads']");
	private final By jewelryCategory = By.cssSelector(".block-category-navigation a[href='/jewelry']");
	private final By giftCardsCategory = By.cssSelector(".block-category-navigation a[href='/gift-cards']");

	// Manufacturers

	@SuppressWarnings("unused")
	private final By manufacturerList = By.cssSelector(".block-manufacturer-navigation ul.list > li");
	private final By tricentisManufacturer = By.cssSelector(".block-manufacturer-navigation a[href='/tricentis']");

	// Newsletter
	private final By newsletterInput = By.id("newsletter-email");
	private final By subscribeButton = By.id("newsletter-subscribe-button");
	private final By loadingIndicator = By.id("subscribe-loading-progress");
	private final By resultBlock = By.id("newsletter-result-block");

	// ===========================
	// ========== Actions ========
	// ===========================

	// --- Header / Navigation ---
	public boolean clickRegister() {
		driver.findElement(registerLink).click();
		return true;
	}

	public boolean clickLogin() {
		driver.findElement(loginLink).click();
		return true;
	}

	public boolean clickShoppingCart() {
		driver.findElement(shoppingCartLink).click();
		return true;
	}

	public boolean clickWishlist() {
		driver.findElement(wishlistLink).click();
		return true;
	}

	public String getCartQuantity() {
		return driver.findElement(cartQuantity).getText();
	}

	public String getWishlistQuantity() {
		return driver.findElement(wishlistQuantity).getText();
	}

	public String getFlyoutCartMessage() {
		return driver.findElement(flyoutCartMessage).getText();
	}

	public boolean enterSearchText(String searchText) {
		WebElement searchField = driver.findElement(searchInputField);
		searchField.clear();
		searchField.sendKeys(searchText);
		return true;
	}

	public boolean clickSearchButton() {
		driver.findElement(searchButton).click();
		return true;
	}

	public boolean isLogoDisplayed() {
		return driver.findElement(logoImage).isDisplayed();
	}

	// --- Top Menu ---
	public void clickBooksMenu() {
		driver.findElement(booksMenu).click();
	}

	public void clickComputersMenu() {
		driver.findElement(computersMenu).click();
	}

	public void clickElectronicsMenu() {
		driver.findElement(electronicsMenu).click();
	}

	public void clickApparelMenu() {
		driver.findElement(apparelMenu).click();
	}

	public void clickDigitalDownloadsMenu() {
		driver.findElement(downloadsMenu).click();
	}

	public void clickJewelryMenu() {
		driver.findElement(jewelryMenu).click();
	}

	public void clickGiftCardsMenu() {
		driver.findElement(giftCardsMenu).click();
	}

	public void clickDesktopsSubmenu() {
		driver.findElement(desktopsSubmenu).click();
	}

	public void clickNotebooksSubmenu() {
		driver.findElement(notebooksSubmenu).click();
	}

	public void clickAccessoriesSubmenu() {
		driver.findElement(accessoriesSubmenu).click();
	}

	public void clickCameraSubmenu() {
		driver.findElement(cameraSubmenu).click();
	}

	public void clickPhonesSubmenu() {
		driver.findElement(phonesSubmenu).click();
	}

	public boolean clickMainMenuByText(String menuName) {
		List<WebElement> menuItems = driver.findElements(allMainMenuLinks);
		for (WebElement item : menuItems) {
			if (item.getText().trim().equalsIgnoreCase(menuName)) {
				item.click();
				return true;
			}
		}
		return false;
	}

	public boolean clickSubMenuByHref(String href) {
		List<WebElement> submenuLinks = driver.findElements(By.cssSelector("ul.sublist.firstLevel a"));
		for (WebElement link : submenuLinks) {
			if (link.getAttribute("href").contains(href)) {
				link.click();
				return true;
			}
		}
		return false;
	}

	// --- Categories ---
	public void clickBooksCategory() {
		driver.findElement(booksCategory).click();
	}

	public void clickComputersCategory() {
		driver.findElement(computersCategory).click();
	}

	public void clickElectronicsCategory() {
		driver.findElement(electronicsCategory).click();
	}

	public void clickApparelCategory() {
		driver.findElement(apparelCategory).click();
	}

	public void clickDownloadsCategory() {
		driver.findElement(downloadsCategory).click();
	}

	public void clickJewelryCategory() {
		driver.findElement(jewelryCategory).click();
	}

	public void clickGiftCardsCategory() {
		driver.findElement(giftCardsCategory).click();
	}

	public boolean clickCategoryByName(String name) {
		List<WebElement> categories = driver.findElements(categoryList);
		for (WebElement cat : categories) {
			if (cat.getText().trim().equalsIgnoreCase(name)) {
				cat.findElement(By.tagName("a")).click();
				return true;
			}
		}
		return false;
	}

	// --- Manufacturer ---
	public void clickTricentisManufacturer() {
		driver.findElement(tricentisManufacturer).click();
	}

	// --- Newsletter ---
	public void enterNewsletterEmail(String email) {
		WebElement input = driver.findElement(newsletterInput);
		input.clear();
		input.sendKeys(email);
	}

	public void clickSubscribe() {
		driver.findElement(subscribeButton).click();
	}

	public String getNewsletterResultMessage() {
		return driver.findElement(resultBlock).getText();
	}

	public boolean isLoadingIndicatorVisible() {
		return driver.findElement(loadingIndicator).isDisplayed();
	}
}
