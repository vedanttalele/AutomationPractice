package day09.CalenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignMentRedbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.clearfix>div>input")));
		driver.findElement(By.cssSelector("div.clearfix>div>input")).sendKeys("pune");
		Thread.sleep(1000);
		List<WebElement> puneLocations=driver.findElements(By.cssSelector("#search div > ul > li"));
		puneLocations.get(3).click();
		driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("Goa");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='onward_cal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("tr:nth-of-type(6)>td:nth-of-type(7)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id=\"search_btn\"]")).click();
		driver.findElement(By.cssSelector(".dt-time-filter li:nth-child(1) label.custom-checkbox")).click();
		driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)>label.custom-checkbox")).click();
	    List<WebElement> totalBuses= driver.findElements(By.cssSelector(".travels"));
	    System.out.println("Buses count: " + totalBuses.size());
	    String busesName = "";
	  		for (int i = 0; i < totalBuses.size(); i++) {
	  			if (totalBuses.size() != i) {
	  				busesName = busesName +totalBuses.get(i).getText() + ", ";
	  			} else {
	  				busesName = busesName+ totalBuses.get(i).getText();
	  			}
	  			
	  		}
	  		System.out.println(busesName);
		
		//driver.close();
	}

}
