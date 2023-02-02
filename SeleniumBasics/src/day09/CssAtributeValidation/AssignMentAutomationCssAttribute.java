package day09.CssAtributeValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignMentAutomationCssAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement btnprimary=driver.findElement(By.cssSelector(".btn-primary"));
		String btnprimaryColorInRGBA=btnprimary.getCssValue("color");
		String btnprimarybgcolor=btnprimary.getCssValue("background-color");
		String btnprimaryBDcolor=btnprimary.getCssValue("border-color");
		System.out.println("BTN Primary CC : "+btnprimaryColorInRGBA);
		System.out.println("BTN Primary BGCC : "+btnprimarybgcolor);
		System.out.println("BTN Primary BDCC : "+btnprimaryBDcolor);
	}

}