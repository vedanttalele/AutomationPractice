package day01.openingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver amz = new ChromeDriver();
    amz.get("http://www.Amazon.in");
    amz.close();
	}

}
