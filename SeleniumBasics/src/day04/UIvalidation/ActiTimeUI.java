package day04.UIvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//UI Validaton for Username Field
		System.out.println("********************UserNameField********************");
		WebElement usernameIPField = driver.findElement(By.id("username"));
		System.out.println("Username Field is Visible or Not : "+ usernameIPField.isDisplayed());
		System.out.println("Username Field is Enable or Not : "+ usernameIPField.isEnabled());
		usernameIPField.click();
		System.out.println("Username Field is Selected or Not : "+ usernameIPField.isSelected());
		System.out.println("Username Field Value is Equal or Not : "+ usernameIPField.getAttribute("placeholder").equals("Username"));
		
		//UI Validation for Password Field
		System.out.println("********************PasswordField********************");
		WebElement passwordIPField = driver.findElement(By.name("pwd"));
		System.out.println("Password Field is Visible or Not : "+ passwordIPField.isDisplayed());
		System.out.println("Password Field is Enable or Not : "+ passwordIPField.isEnabled());
		System.out.println("Password Field is Selected or Not : "+ passwordIPField.isSelected());
		System.out.println("Password Field Default Value is Equal or Not : "+ passwordIPField.getAttribute("placeholder").equals("Password"));
		
		//UI Validation for Check Box
		System.out.println("********************CheckBoxField********************");
		WebElement checkBoxField = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("CheckBox Field is Visible or Not : "+ checkBoxField.isDisplayed());
		System.out.println("CheckBox Field is Enable or Not : "+ checkBoxField.isEnabled());
		System.out.println("CheckBox Field is Selected or Not : "+ checkBoxField.isSelected());
		checkBoxField.click();
		System.out.println("CheckBox Field After Selection is Selected or Not : "+ checkBoxField.isSelected());
		
		//UI Validation for KEEP ME LOGGED IN Field
		System.out.println("********************KeepMeLoggedInField********************");
		WebElement labelIPField = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("Keep Me Logged In Field is Visible or Not : "+ labelIPField.isDisplayed());
		System.out.println("Keep Me Logged In Field is Enable or Not : "+ labelIPField.isEnabled());
		System.out.println("Keep Me Logged In Field Test is Equal or Not : "+ labelIPField.getText().equals("Keep me logged in"));
	
		//UI Validation for Login Button Field
		System.out.println("********************LoginButtonField********************");
		WebElement loginButtonField = driver.findElement(By.id("loginButton"));
		System.out.println("Login Button Field is Visible or Not : "+ loginButtonField.isDisplayed());
		System.out.println("Login Button Field is Enable or Not : "+ loginButtonField.isEnabled());
		System.out.println("Login Button Field Value is Equal or Not : "+ loginButtonField.getText().equals("Login"));
	}

}
