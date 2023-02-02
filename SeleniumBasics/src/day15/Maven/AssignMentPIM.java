package day15.Maven;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day12.Utilities.SeleniumUtility;



public class AssignMentPIM {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//      PIM Created
		SeleniumUtility util = new SeleniumUtility();
		
		driver = util.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		util.performClick(driver.findElement(By.xpath("//*[text()='PIM']")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Add Employee']")));
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Automation", Keys.TAB, Keys.TAB, "Testing");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
		util.performClick(driver.findElement(By.xpath("//*[@type='submit']")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		util.performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='(1) Record Found']"))));
		WebElement rec = driver.findElement(By.xpath("//*[text()='(1) Record Found']"));
		if (rec.getText().equals("(1) Record Found")) {
			System.out.println("PIM Created Successfully");
		}

//      PIM Modification
		util.performClick(driver.findElement(By.xpath("//*[@id='app']//button[2]/i")));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		util.performClick(driver.findElement(By.xpath("//*[text()='Job']")));
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//*[@id='app']//div[2]/div/div[2]/div/div/div[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();
		for (int i = 0; i < 30; i++) {
			Actions act = new Actions(driver);
			
			act.moveToElement(title).sendKeys(Keys.ARROW_DOWN).build().perform();
			if (title.getText().equals("QA Engineer")) {
				
				util.performClick(title);
				break;
			}
		}
		util.performClick(driver.findElement(By.xpath("//div[3]/button")));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		util.performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		util.performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));
		WebElement job = driver.findElement(By.xpath("//*[@id='app']//div[2]/div/div/div[5]"));
		if (job.getText().equals("QA Engineer")) {
			System.out.println("PIM Updated Successfully");
		}

		
//		PIM Deletion
		util.performClick(driver.findElement(By.xpath("//*[@id='app']//div[9]/div/button[1]")));
		util.performClick(driver.findElement(By.xpath("//*[@id='app']//div[3]/button[2]")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		util.performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));

		WebElement rec1 = driver.findElement(By.xpath("//*[text()='No Records Found']"));
		if (rec1.getText().equals("No Records Found")) {
			System.out.println("PIM Deleted Successfully");
		}
		util.performClick(driver.findElement(By.xpath("//span/p")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Logout']")));
		util.cleanUp();
	}
}
//setTimeout(function(){debugger;}, 5000)
