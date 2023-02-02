package day11.KeyBoardAndMouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation6 {

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://www.facebook.com/");
		/* Instance of Action Class */
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement userNameInputField = driver.findElement(By.name("firstname"));
		userNameInputField.sendKeys("admin");
		// userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		// or
		action.doubleClick(userNameInputField).perform();
		userNameInputField.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

	public static WebDriver setUp(String browserName, String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("http://demo.automationtesting.in/Register.html");
		return driver;

	}
}
