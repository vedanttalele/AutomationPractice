package day06.MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssighMentCricInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com/");
		List<WebElement> cric = driver.findElements(By.cssSelector(".ds-flex-1 > div:nth-child(1) > div"));
		System.out.println("Menu Option Count is : " + cric.size());
		for (int i = 0; i < cric.size(); i++) {
			System.out.println("Cricket Menu Option No." + (i + 1) + " is : " + cric.get(i).getText());
		}
	}
}
