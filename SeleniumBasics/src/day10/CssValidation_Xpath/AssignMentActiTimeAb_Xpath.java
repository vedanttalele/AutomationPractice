package day10.CssValidation_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMentActiTimeAb_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// type username as admin
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td/input")).sendKeys("admin");
		/* type password as manager */
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
		/* click on login button */
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
	}

}
