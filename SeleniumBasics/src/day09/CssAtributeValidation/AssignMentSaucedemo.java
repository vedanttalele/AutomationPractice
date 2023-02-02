package day09.CssAtributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignMentSaucedemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String[] usernames = driver.findElement(By.id("login_credentials")).getText().split("\n");
		String[] paasword = driver.findElement(By.cssSelector(".login_password")).getText().split("\n");

		for (int i = 1; i < usernames.length; i++) {
			// identify username input field
			WebElement usernameInputField = driver.findElement(By.id("user-name"));
			usernameInputField.clear();
			usernameInputField.sendKeys(usernames[i]);
			Thread.sleep(1000);
			// identify password input field
			WebElement pwdInputField = driver.findElement(By.id("password"));
			pwdInputField.clear();
			pwdInputField.sendKeys(paasword[1]);
			Thread.sleep(1000);
			// identify login button
			driver.findElement(By.id("login-button")).click();
			if (driver.getCurrentUrl().contains("inventory")) {
				System.out.println("Login successfull for user: " + usernames[i]);
				wait.until(ExpectedConditions.urlContains("inventory"));
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("logout_sidebar_link")).click();
			} else {
				System.out.println("Login failed for user: " + usernames[i]);
				usernameInputField.clear();
				pwdInputField.clear();
			}
		}
		driver.close();
	}
}
//List<WebElement> usernames = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/text()"));
//String[] paasword = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/text()"));
