package day06.MultipleElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignMentGSMArena {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		List<WebElement> gsm = driver.findElements(By.cssSelector("#body .clearfix > ul>li"));
		System.out.println("Mobile Brands Count is : " + gsm.size());
		for (int i = 0; i < gsm.size(); i++) {
			System.out.println("Brand Mobile No. " + (i + 1) + " Name is : " + gsm.get(i).getText());
		}
		for (int i = 0; i < gsm.size(); i++) {
			if (gsm.get(i).getText().equals("SAMSUNG")) {
				gsm.get(i).click();
				break;
			}
		}

		List<WebElement> samsung = driver.findElements(By.cssSelector(".makers > ul > li"));
		System.out.println("Samsung Mobile Count : " + samsung.size());

		for (int i = 0; i < samsung.size(); i++) {
			WebElement next = driver.findElement(By.cssSelector(".pages-next"));
			

				samsung = driver.findElements(By.cssSelector(".makers > ul > li"));
				System.out.println("Samsung Device No. " + (i + 1) + " Name is : " + samsung.get(i).getText());
				if (next.isEnabled()) {
			}
			next.click();
		}

	}

}
/*
 * // 1. Year(ascending order validation)
		
		*/
