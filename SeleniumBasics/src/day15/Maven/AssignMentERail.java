package day15.Maven;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day12.Utilities.SeleniumUtility;


public class AssignMentERail {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();

		WebDriver driver = util.setUp("chrome", "https://erail.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String homePageWinId = driver.getWindowHandle();// T1
		System.out.println("Home page window ID: " + homePageWinId);
		util.performClick(driver.findElement(By.xpath("//*[text()='eCatering']")));

		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);// T1,T2
		allWinIds.remove(homePageWinId);// T2
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);
		driver.switchTo().window(allWinIds.iterator().next());
		util.performClick(driver.findElement(By.xpath("//*[@placeholder='Search Train or Station to explore']")));
		util.typeInput(driver.findElement(By.xpath("//*[@placeholder='Start typing Nagpur, NGP, Rajdhani']")), "12627");
		util.performClick(driver.findElement(By.xpath("//*[text()='12627']")));
		WebElement date = driver.findElement(By.xpath("//*[@type='date']"));
		util.performClick(date);
		date.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		WebElement station = driver.findElement(By.xpath("//*[@placeholder='Boarding Station']"));
		wait.until(ExpectedConditions.elementToBeClickable(station));
		util.performClick(station);
		wait.until(ExpectedConditions.elementToBeClickable(station));
		station.sendKeys("I", Keys.ENTER);
		util.performClick(driver.findElement(By.xpath("//*[text()='FIND FOOD']")));
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
		util.cleanUp();

	}
}

//		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElements(By.xpath("//*[@id=\"page-container\"]//div[2]//div[2]//div/div/div[2]//h5")).get(i));
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/h5
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/h5
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/h5
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/h5
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/h5
// *[@id="page-container"]/div/div[1]/div[2]/div/div[2]/div/div/div[1]/h5
//		List<WebElement> resNames =driver.findElements(By.xpath("//*[@id=\"page-container\"]//div[2]//div[2]//div/div/div[2]//h5"));
//		String resNames1 = "";
//		// Get dropdown option names
//		for (int i = 1; i < resNames.size(); i++) {
//			if ((resNames.size() - 1) != i) {
//				resNames1 = resNames1 + resNames.get(i).getText() + ", ";
//			} else {
//				resNames1 = resNames1 + resNames.get(i).getText();
//			}
//			System.out.println(resNames1);
//		}
//		System.out.println(resNames1);

/*
 * Open any browser and enter https://erail.in/ click on "eCatering" Enter train
 * number as 12627 and select train from suggestion Select boarding date from
 * next month Select boarding station as Itarsi and click in find food print
 * shown result count and also print all restaurant names
 */