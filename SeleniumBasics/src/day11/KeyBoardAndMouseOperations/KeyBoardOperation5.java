package day11.KeyBoardAndMouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperation5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		Thread.sleep(1000);
		driver.close();
	}

}
/**
 * possible ways to refresh the browser: 
 * 1. driver.navigate().refresh();
 * 2.sendKeys(Keys.F5) 
 * 3. by hitting same URL again 
 * 4. ctrl+R
 */