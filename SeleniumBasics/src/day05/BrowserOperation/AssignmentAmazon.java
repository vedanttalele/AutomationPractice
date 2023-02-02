package day05.BrowserOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentAmazon {

	public static void main(String[] args) throws Exception, NoSuchElementException {
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		String homePageTitle = driver.getTitle();
		System.out.println("Page Title :" + homePageTitle);
		// Amazon Pay Link
		driver.findElement(By.linkText("Amazon Pay")).click();
		Thread.sleep(1000);
		System.out.println("AmazonPay Title is :" + driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		List<WebElement> amzOpt = driver.findElements(By.cssSelector("#nav-xshop > a"));
		System.out.println("Amazon Option Size :" + amzOpt.size());

		for (int i = 0; i < amzOpt.size(); i++) {
			if (!amzOpt.get(i).getText().isEmpty()) {
				System.out.println("Amazon Option No." + (i + 1) + " is : " + amzOpt.get(i).getText());
			} else {
				System.out.println("Amazon Option No." + (i + 1) + " is : " + amzOpt.get(i).getAttribute("innerHTML"));
			}
		}

		driver.close();
	}
}
/*
 * TC1: 1. Open flipkart Validate home page Get main menu option count Print
 * main menu option name TC2: 1. Open cricinfo.com Validate home page Get main
 * menu option count Print main menu option name TC3: 1. Open gsmarena.com
 * Validate home page Get mobile phone name count from phone finder Print mobile
 * phone name TC4: 1. Open gsmarena.com Validate home page Click on Samsung
 * phone link present in phone finder Get device count and print on console
 * Print all the device names on the console
 */
//WebDriverWait wait = new WebDriverWait(driver, 20);
// wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop
// Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
//		String title = driver.getTitle();
//		System.out.println(title);
//		System.out.println("Verify page Title :" + homePageTitle.equals(title));
//		Thread.sleep(1000);
//		// All Menu Link
//		driver.findElement(By.id("nav-hamburger-menu")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("#hmenu-canvas-background > div")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Best Sellers")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Sell")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Amazon miniTV")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Mobiles")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Today's Deals")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Customer Service")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Electronics")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		WebElement primeD = driver.findElement(By.linkText("Prime"));
//		Thread.sleep(1000);
//		primeD.click();
//		driver.findElement(By.linkText("Fashion")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Home & Kitchen")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("New Releases")).click();
//		driver.navigate().back();
//		Thread.sleep(1000);