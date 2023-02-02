package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class saucedemo {

	public static void main(String[] args) {
		// set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required application url
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		String[] usernames=driver.findElement(By.id("login_credentials")).getText().split("\n");
		String[] paasword=driver.findElement(By.cssSelector(".login_password")).getText().split("\n");

		for(int i=1;i<usernames.length;i++) {
			//identify username input field
			WebElement usernameInputField=driver.findElement(By.id("user-name"));
			usernameInputField.clear();
			usernameInputField.sendKeys(usernames[i]);
			//identify password input field
			WebElement pwdInputField=driver.findElement(By.id("password"));
			pwdInputField.clear();
			pwdInputField.sendKeys(paasword[1]);
			//identify login button
			driver.findElement(By.id("login-button")).click();			
			if(driver.getCurrentUrl().contains("inventory")) {
				System.out.println("Login successfull for user: "+usernames[i]);
				wait.until(ExpectedConditions.urlContains("inventory"));
				driver.findElement(By.id("react-burger-menu-btn")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
			}else {
				System.out.println("Login failed for user: "+usernames[i]);
				usernameInputField.clear();
				pwdInputField.clear();
			}
		}
		
	}

}
