package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleAppnWithBeforeAfterTest extends SeleniumUtility {

	WebDriver driver;
	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}
	@Test
	public void testSearch() {
		getActiveElement().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getPageTitle().contains("SQL"), "SQL search is failed");
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
}
/**
 * precondition: open browser and enter google url
 * 			TC1: validation google page
 * 			TC2: search SQL and validation search result page
 * post-condition: close the browser 
 */