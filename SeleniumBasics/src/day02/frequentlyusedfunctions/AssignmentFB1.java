package day02.frequentlyusedfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFB1 {

	public static void main(String[] args) throws InterruptedException {
		//set required driver executable path using System.setProperty(String key,String value)
				//using absolute path
				//System.setProperty("webdriver.chrome.driver", "D:\WorkSpace\SeleniumBasics\drivers\chromedriver.exe");
				
				//or using relative path 
				//System.setProperty("webdriver.chrome.driver", ".\drivers\chromedriver.exe");
				
				//or using current working dir
				String exePath=System.getProperty("user.dir")+"/drivers/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				
				//create an instance of required browser class
				WebDriver cdriver=new ChromeDriver();
				cdriver.get("https://www.facebook.com/");
				System.out.println(cdriver.getTitle());
				System.out.println(cdriver.getTitle().equals("Facebook"));
				WebElement fbid = cdriver.findElement(By.id("email"));
				fbid.sendKeys("vedantvt2411@gmail.com");
				
				WebElement fbpwd = cdriver.findElement(By.id("pass"));
				fbpwd.sendKeys("Vedant057@.");
			
				WebElement fblogin = cdriver.findElement(By.name("login"));
				fblogin.click();
				
		        cdriver.findElement(By.tagName("image")).click();
		        
		        cdriver.findElement(By.tagName("span")).click();
				
				Thread.sleep(5000);
				
				cdriver.close();
				
			}
		
		/**
		 * Every time Selenium launches a new browser, it won't work on already opened browser
		 * Browser opened by selenium won't be having-
		 * 		-History
		 * 		-Cookies
		 * 		-Plugins
		 */ 
	}


