package day02.frequentlyusedfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActiTime1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver actitime = new ChromeDriver();
		actitime.get("http://demo.actitime.com/");
		System.out.println("Page Title "+actitime.getTitle());
		System.out.println("Page Title length "+actitime.getTitle().length());
		System.out.println(actitime.getCurrentUrl());
		System.out.println(actitime.getCurrentUrl().length());
		System.out.println(actitime.getCurrentUrl().equals("https://demo.actitime.com/login.do"));
	    //System.out.println("Page Source length "+actitime.getPageSource());pageLength=PageSourceLength
		System.out.println("Page Source length "+actitime.getPageSource().length());
		
		actitime.close();	
	}
}
