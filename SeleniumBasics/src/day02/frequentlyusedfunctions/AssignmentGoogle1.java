package day02.frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentGoogle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("Page URL "+driver.getCurrentUrl());
        System.out.println(driver.getPageSource().length());
        
        driver.close();
	}

}
