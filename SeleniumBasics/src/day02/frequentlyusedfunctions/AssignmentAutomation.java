package day02.frequentlyusedfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("Title is "+driver.getTitle());
		System.out.println("Title length is "+driver.getTitle().length());
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL is :"+currenturl);
		String expectedurl = "https://www.facebook.com/";
		System.out.println("Verifying URL :"+currenturl.equals(expectedurl));
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("vedantvt2411@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vedant057@.");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		System.out.println("Current Title is :"+driver.getTitle());
		System.out.println("Current URL is :"+driver.getCurrentUrl());
		driver.findElement(By.tagName("image")).click();
		WebDriverWait logoutwait =new WebDriverWait(driver,20);
		logoutwait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
		
		driver.close();
	}
}
//html>body>#page>.loginPageContainer>div:nth-of-type(1)>div>#loginFormDiv>form>div:nth-of-type(1)>#username