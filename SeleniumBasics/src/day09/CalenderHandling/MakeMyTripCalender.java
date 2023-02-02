package day09.CalenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalender {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.makemytrip.com/");
		//to handle offer popup
		try {
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div>p")).click();
	}

}
