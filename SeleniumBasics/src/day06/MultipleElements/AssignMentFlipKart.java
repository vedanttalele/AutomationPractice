package day06.MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMentFlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.className("_2doB4z")).click();
		driver.navigate().refresh();
		List<WebElement> opt = driver
				.findElements(By.cssSelector("div>div:nth-of-type(2)>div>div>div>a>div:nth-of-type(2)"));
		System.out.println("Menu Options Count :" + opt.size());
		for (int i = 0; i < opt.size(); i++) {
			System.out.println("Option No."+(i+1)+" is :"+ opt.get(i).getText());
		}

//		driver.navigate().back();
//	
//		WebElement css = driver.findElement(By.cssSelector("div:nth-child(3) > a > div._1psGvi.SLyWEo > div > div"));
//		driver.findElement(By.cssSelector("div:nth-child(3) > a > div._1psGvi.SLyWEo > div > div")).click();
//		Thread.sleep(2000);
//		driver.close();
	}

}
