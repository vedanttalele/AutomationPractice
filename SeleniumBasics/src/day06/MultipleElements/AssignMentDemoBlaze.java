package day06.MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMentDemoBlaze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		List<WebElement> mobileName = driver.findElements(By.cssSelector("#tbodyid > div> div > div > h4 > a"));
		List<WebElement> mobilePrice = driver.findElements(By.cssSelector("#tbodyid > div > div > div>h5"));
		System.out.println("Mobile Count is " + mobileName.size());
		for (int i = 0; i < mobileName.size(); i++) {
			System.out.println("Mobile Name is : " + mobileName.get(i).getText());
			System.out.println("Mobile Price is : " + mobilePrice.get(i).getText());
			WebElement next = driver.findElement(By.id("next2"));
			if (next.isEnabled()) {
				next.click();
			}
		}
	}
}
