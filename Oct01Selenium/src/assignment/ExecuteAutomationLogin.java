package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomationLogin {

	public static void main(String[] args) {
		// set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		//To sync automation tool speed with application, we need to use implicit wait to avoid NoSuchElementException
		// after implicit wait, whenever you will use driver instance, you will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required application url
		driver.get("https://demosite.executeautomation.com/Login.html");
		//below driver will get 0-30 sec to identify username input field
		driver.findElement(By.name("UserName")).sendKeys("Admin");
		//below driver will get 0-30 sec to identify password input field
		driver.findElement(By.name("Password")).sendKeys("admin123");	
		//below driver will get 0-30 sec to identify login button
		driver.findElement(By.name("Login")).submit();
	}
}
