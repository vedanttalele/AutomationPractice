package day04.UIvalidation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitActitime {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				// create instance of required browser class
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// enter the required URL
				driver.get("https://demo.actitime.com/login.do");
				System.out.println("Login page title: "+driver.getTitle());
				//type user name as admin  
				driver.findElement(By.id("username")).sendKeys("admin");
				/*type password as manager */ 
				driver.findElement(By.name("pwd")).sendKeys("manager");
				/*click on login button*/
				driver.findElement(By.id("loginButton")).click();
				
				//Create an instance of FluentWait class with timeout, polling time(retry) and exception to be ignored
				
				FluentWait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				FluentWait wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(05))
				.ignoring(Throwable.class);		
				
				//implement condition for wait, poling works like 5,10,15 and 20
				wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
			
				//click on logout link
				driver.findElement(By.id("logoutLink")).click();
				driver.close();
	}
}
