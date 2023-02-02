package day14.BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day12.Utilities.SeleniumUtility;

public class BrokenLinkExample extends SeleniumUtility {
	public static void main(String[] args) {
		BrokenLinkExample ble = new BrokenLinkExample();
		ble.testLinks();

	}

	public void testLinks() {
		//setUp("chrome", "https://demoqa.com/broken");
		//setUp("chrome", "https://www.flipkart.com/");
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		setUp("chrome", "https://www.amazon.in/");
		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());
		// checking the links fetched.
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + "----response code is----> " + httpURLConnect.getResponseMessage()
						+ "---- is a invalid/broken link");
			}
			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + "----response code is---->" + httpURLConnect.getResponseMessage()
						+ "---- Valid link");
			}
		} catch (Exception e) {
		}
	}
}