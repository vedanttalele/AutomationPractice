package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginWithCred {

	public static void main(String[] args) {
		// set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required application url
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait=new WebDriverWait(driver,20);
		String[] usernames=driver.findElement(By.id("userCredentialsUsername")).getText().split(": ");
		String[] paasword=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(4)>td")).getText().split(": ");

		driver.findElement(By.id("username")).sendKeys(usernames[1]);
		driver.findElement(By.name("pwd")).sendKeys(paasword[1]);
		driver.findElement(By.id("loginButton")).click();
	}

}
