package day02.frequentlyusedfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {
		//set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//enter the required application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//identify username input field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//clear username inputfield
		usernameInputField.clear();
		//type username as admin
		usernameInputField.sendKeys("admin");
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.id("password"));
		//clear password field
		passwordInputField.clear();
		//type password as Test@123
		passwordInputField.sendKeys("Test@123");
		//identify Sign in button
		WebElement signinBtn=driver.findElement(By.className("buttonBlue"));
		//click on signin button
		signinBtn.click();
		//get home page title
		System.out.println("Home page title is: "+driver.getTitle());
		//close the brower
		driver.close();
	}
}
/**
 * Before we perform any required action of the element first we need to identify that element uniquely
 * 
 * To identify any element uniquely we can use findElement(By) of WebDriver which will return WebELement
 * 
 * findElement(By)--->
 * 					By is predefined class which has several static method known as locators
 * 					selenium support following locator to locate the element from the web application
 * 						id(""),	name(""), linkText(""), partialLinkText(""), className(""),tagName("")
 *						cssSelector("") and xpath("") 
 *
 *		WebElement element=driver.findElement(By.id(""));
 *
 *Once you the require element dn you can perform any required action like
 *		click- click()
 *		type-  sendKeys("");
 *		remove existing text -  clear()
 *
 *		element.click()
 *		element.senkKeys("admin");
 *		element.clear();
 */



/**
open any browser
Enter application URL https://demo.vtiger.com/vtigercrm/index.php
clear username field
type username as admin
clear password field
type password as Test@123
click on Signin button 
 */
