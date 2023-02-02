package day7.keuboardAndMouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class OpenGoogle {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/");
		//search selenium in google
		//WebElement userInputField=driver.findElement(By.id("username"));
		//s1.typeInput(searchInputField, "admin");
				//or
		s1.typeInput(driver.findElement(By.id("username")), "admin");
		s1.typeInput(driver.findElement(By.name("pwd")), "manager");
		s1.performClick(driver.findElement(By.id("loginButton")));

	}

}
