package day01.openingbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// set required driver executable path using System.setProperty(String key,String value)
				// using absolute path
				// System.setProperty("webdriver.gecko.driver","D:\WorkSpace\SeleniumBasics\drivers");

				// or using relative path
				// System.setProperty("webdriver.gecko.driver", ".\drivers\geckodriver.exe");

				// or using current working dir
				String exePath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", exePath);

				// create an instance of required browser class
				FirefoxDriver fdriver = new FirefoxDriver();
			}
		
		/**
		 * Every time Selenium launches a new browser, it won't work on already opened
		 * browser Browser opened by selenium won't be having- 
		 * -History 
		 * -Cookies
		 * -Plugins
		 */
	}


