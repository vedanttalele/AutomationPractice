package testNG;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestngErail extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void countNames() {
		setUp("chrome", "https://erail.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String homePageWinId = driver.getWindowHandle();// T1
		System.out.println("Home page window ID: " + homePageWinId);
		performClick(driver.findElement(By.xpath("//*[text()='eCatering']")));
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);// T1,T2
		allWinIds.remove(homePageWinId);// T2
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);
		driver.switchTo().window(allWinIds.iterator().next());
		performClick(driver.findElement(By.xpath("//*[@placeholder='Search Train or Station to explore']")));
		typeInput(driver.findElement(By.xpath("//*[@placeholder='Start typing Nagpur, NGP, Rajdhani']")), "12627");
		performClick(driver.findElement(By.xpath("//*[text()='12627']")));
		WebElement date = driver.findElement(By.xpath("//*[@type='date']"));
		performClick(date);
		date.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		WebElement station = driver.findElement(By.xpath("//*[@placeholder='Boarding Station']"));
		wait.until(ExpectedConditions.elementToBeClickable(station));
		performClick(station);
		wait.until(ExpectedConditions.elementToBeClickable(station));
		station.sendKeys("I", Keys.ENTER);
		performClick(driver.findElement(By.xpath("//*[text()='FIND FOOD']")));
		System.out.println(driver.findElement(By.xpath("//*[text()='Showing ']")).getText());
		List<WebElement> resNames = driver
				.findElements(By.xpath("//*[@id=\"page-container\"]//div[2]//div[2]//div/div/div[2]//h5"));
		System.out.println(+resNames.size());
		for (int i = 0; i < resNames.size(); i++) {
			if (!resNames.get(i).getText().isEmpty()) {
				System.out.println("No." + (i + 1) + " is : " + resNames.get(i).getText());
			} else {
				System.out.println("No." + (i + 1) + " is : " + resNames.get(i).getAttribute("innerHTML"));
			}
		}
		cleanUp();
	}
}