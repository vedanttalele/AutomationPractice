package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestngPIM extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void createPIM() throws InterruptedException {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		performClick(driver.findElement(By.xpath("//*[text()='PIM']")));
		performClick(driver.findElement(By.xpath("//*[text()='Add Employee']")));
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Automation", Keys.TAB, Keys.TAB, "Testing");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
		performClick(driver.findElement(By.xpath("//*[@type='submit']")));
		performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		typeInput(driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input")),
				"Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));
		WebElement rec = driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div/span"));
		if (rec.getText().equals("(1) Record Found")) {
			System.out.println("PIM Created Successfully");
		}
	}

	public void modifyPIM() {
		performClick(driver.findElement(By.xpath("//*[@id='app']//button[2]/i")));
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		performClick(driver.findElement(By.xpath("//*[text()='Job']")));
		WebElement title = driver.findElement(By.xpath("//*[@id='app']//div[2]/div/div[2]/div/div[1]"));
		title.click();
		for (int i = 0; i < 30; i++) {
			Actions act = new Actions(driver);
			act.moveToElement(title).sendKeys(Keys.ARROW_DOWN).build().perform();
			if (title.getText().equals("QA Engineer")) {
				performClick(title);
				break;
			}
		}
		performClick(driver.findElement(By.xpath("//*[text()=' Save ' and @type='submit']")));
		performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		typeInput(driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input")),
				"Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));
		WebElement job = driver.findElement(By.xpath("//*[@id='app']//div[2]/div/div/div[5]"));
		if (job.getText().equals("QA Engineer")) {
			System.out.println("PIM Updated Successfully");
		}
	}

	public void deletePIM() {
		performClick(driver.findElement(By.xpath("//*[@id='app']//div[9]/div/button[1]")));
		performClick(driver.findElement(By.xpath("//*[@id='app']//div[3]/button[2]")));
		performClick(driver.findElement(By.xpath("//*[text()='Employee List']")));
		typeInput(driver.findElement(By.xpath("//*[@id='app']//div/div[1]/div/div[2]/div/div/input")),
				"Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and text()=' Search ']")));
		performClick(driver.findElement(By.xpath("//*[@type='submit' and text()=' Search ']")));
		WebElement rec1 = driver.findElement(By.xpath("//*[text()='No Records Found']"));
		if (rec1.getText().equals("No Records Found")) {
			System.out.println("PIM Deleted Successfully");
		}
		performClick(driver.findElement(By.xpath("//*[text()='Paul Collings']")));
		performClick(driver.findElement(By.xpath("//*[text()='Logout']")));
		cleanUp();
	}
}