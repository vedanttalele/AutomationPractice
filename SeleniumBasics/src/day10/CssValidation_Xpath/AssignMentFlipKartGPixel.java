package day10.CssValidation_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMentFlipKartGPixel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//driver.findElement(By.xpath("/html/body/div[2]/div")).click();
		try {
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		} catch (NoSuchElementException e) {
		}
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
				.sendKeys("google pixel");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		WebElement price =driver.findElement(By.xpath("//div[div[div[text()=\"Google Pixel 6a (Charcoal, 128 GB)\"]]]/div[2]/div[1]/div[1]/div[1]"));
		System.out.println("Google Pixel 6a Price : "+price.getText());
	}

}
