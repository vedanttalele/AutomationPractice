package day03.synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerloginlogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.className("buttonBlue")).click();

		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/div/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		driver.close();
	}
}
