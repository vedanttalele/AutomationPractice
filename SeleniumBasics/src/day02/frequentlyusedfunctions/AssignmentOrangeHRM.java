package day02.frequentlyusedfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
       // driver.findElement(By.className("orangehrm-login-button")).click();
        //or use tagname to login
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
        driver.close();
	
	}

}
