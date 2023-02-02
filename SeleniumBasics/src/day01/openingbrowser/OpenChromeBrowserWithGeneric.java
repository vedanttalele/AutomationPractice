package day01.openingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithGeneric {

	public static void main(String[] args) {
		//set required driver executable path using System.setProperty(String key,String value)
				//using absolute path
				//System.setProperty("webdriver.chrome.driver", "D:\WorkSpace\SeleniumBasics\drivers\chromedriver.exe");
				
				//or using relative path 
				//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				//or using current working dir
				String exePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				
				//create an instance of required browser class
				WebDriver driver=new ChromeDriver();//run time poly example
	            driver.close();		
	}
		
		/**
		 * Every time Selenium launches a new browser, it won't work on already opened browser
		 * Browser opened by selenium won't be having-
		 * 		-History
		 * 		-Cookies
		 * 		-Plugins
		 */ 
	}


