package day05.CSS;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentTech {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    WebDriver tdriver = new ChromeDriver();
		    tdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    tdriver.get("https://www.Techlistic.com");
		    
		    tdriver.manage().window().maximize();
		    Thread.sleep(1000);
		    //Java Link
		    tdriver.findElement(By.cssSelector(".overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(1) > a")).click();
		    String JavaPageTitle =tdriver.getTitle();
		    System.out.println("Java Page Title Validation :"+JavaPageTitle);
		    tdriver.navigate().back();
		    Thread.sleep(1000);
		    
		    FluentWait<WebDriver> wait=new FluentWait<WebDriver>(tdriver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5))
					.ignoring(TimeoutException.class);
					
		    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(2) > div > a")));
		    //Selenium Link
		    
		    tdriver.findElement(By.cssSelector(".overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(2) > div > a")).click();
		    String SeleniumPageTitle =tdriver.getTitle();
		    System.out.println("Selenium Page Title Validation :"+SeleniumPageTitle);
		    tdriver.navigate().back();
		    Thread.sleep(1000);
		    
		    //BDD Link
		    /*
		    tdriver.findElement(By.cssSelector(".overflowable-3 > div.overflowable-contents > div > ul > li:nth-child(7) > div > a")).click();
		    String BDDPageTitle =tdriver.getTitle();
		    System.out.println("BDD Page Title Validation :"+BDDPageTitle);
		    tdriver.navigate().back();
		    Thread.sleep(1000); 
	*/
	}
}