package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestngSortable extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void f() {
		setUp("chrome", "https://jqueryui.com/");
		performClick(driver.findElement(By.xpath("//a[text()='Sortable']")));
		driver.switchTo().frame(0);
		List<WebElement> src = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement target = driver.findElement(By.xpath("//ul[@id='sortable']//li"));
		for (int i = src.size() - 1; i > 0; i--) {
			performDragAndDrop(src.get(i), target);
			setSleepTime(1000);
		}
		cleanUp();
	}
}
