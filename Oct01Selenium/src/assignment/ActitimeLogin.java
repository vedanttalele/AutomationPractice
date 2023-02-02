package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {

	public static void main(String[] args) {
		// set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		// enter the required application url
		driver.get("https://demo.actitime.com/login.do");
		String loginPageTitle=driver.getTitle();
		System.out.println("Login page title: "+loginPageTitle);
		System.out.println("Login page title length: "+loginPageTitle.length());		
		String expectedTitle="actiTIME - Login";
		System.out.println("Login page validation: "+loginPageTitle.equals(expectedTitle));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");		
		driver.findElement(By.id("loginButton")).click();
		
		//required conditional wait as Home page takes sometime to update its title
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		String actualHomePageTitle=driver.getTitle();
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		System.out.println("Actaul Home page title: "+actualHomePageTitle);
		System.out.println("Home page validation status is: "+actualHomePageTitle.equals(expectedHomePageTitle));
	}
}
/**
 * After successfull login verify home page title
 */
