package day04.handlingMutlipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooggleSuggestions {

	public static void main(String[] args) {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://www.google.com/");
		//Search SQL in google
		driver.findElement(By.name("q")).sendKeys("SQL");
		//get all the suggestion list from Google search page
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		System.out.println("Suggestion count is: "+suggList.size());
		//print one by one all the suggestions
		for(int i=0;i<suggList.size();i++) {
//			WebElement element=suggList.get(i);
//			System.out.println("Suggestion name is : "+element.getText());
						//or
			//to avoid staleElementReferenceException re-identify suggList
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
			System.out.println("Suggestion name is : "+suggList.get(i).getText());
		}
		
		for(int i=0;i<suggList.size();i++) {
			String suggName=suggList.get(i).getText();
			if(suggName.equals("sql full form")) {
				suggList.get(i).click();
				break;
			}
		}
	}

}
