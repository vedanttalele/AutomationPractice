package day10.CssValidation_Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignMentAmazonXpath {

	public static void main(String[] args) throws Exception, NoSuchElementException {
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> amzMenu = driver.findElements(By.cssSelector("#nav-xshop > a"));
		System.out.println("Amazon Option Size :" + amzMenu.size());
		amzMenu.get(19).click();
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[1]/ul/li[1]/span/a/div/label/i")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul[2]/li[1]/span/a/div/label/i")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[3]/ul/li[1]/span/a/div/label/i")).click();
	}
}