package webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeBrowserWithGeneric {

	public static void main(String[] args) {

//		//or using current working dir
//		String exePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriverManager.chromedriver().setup();
		// create an instance of required browser class
		WebDriver driver = new ChromeDriver();// run time poly example
		driver.get("https://www.google.com");
	}
}