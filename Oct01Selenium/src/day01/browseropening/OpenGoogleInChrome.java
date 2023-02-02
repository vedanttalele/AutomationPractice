package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleInChrome {

	public static void main(String[] args) {
		//set required driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();//run time poly example
		//enter google application URL
		driver.get("http://www.google.com");
		//to close browser opened by WebDriver dn use
		driver.close();
	}
}
