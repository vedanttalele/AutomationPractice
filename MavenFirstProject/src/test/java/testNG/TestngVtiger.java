package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestngVtiger extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void createTask() {
		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		performClick(driver.findElement(By.className("buttonBlue")));
		performClick(driver.findElement(By.xpath("//*[@id='appnavigator']/div")));
		performClick(driver.findElement(By.xpath("//*[text()=' MARKETING']")));
		performClick(driver.findElement(By.cssSelector(" div:nth-of-type(2)>ul>div>div>li:nth-of-type(2)>a")));
		performClick(driver.findElement(By.xpath("//*[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")));
		performClick(driver.findElement(By.xpath("//*[@id='s2id_autogen1']")));
		List<WebElement> autogen = driver.findElements(By.xpath("//*[@id='select2-results-2']/li"));
		performClick(autogen.get(1));
		driver.findElement(By.xpath("//*[@id='Leads_editView_fieldName_firstname']")).sendKeys("Automation", Keys.TAB,
				"Testing");
		performClick(driver.findElement(By.xpath("//*[text()='Save']")));
//		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val = driver.findElement(By.xpath("//h4/span"));
		if (val.getText().contains("Automation Testing")) {
			System.out.println("Task Created");
		}
	}

	@Test
	public void modifyTask() {
//		performClick(driver.findElement(By.xpath("//h4/span")));
		performClick(driver.findElement(By.xpath("//*[text()='Edit']")));
		typeInput(driver.findElement(By.xpath("//*[@id='Leads_editView_fieldName_phone']")), "9876543210");
		performClick(driver.findElement(By.xpath("//*[text()='Save']")));
//		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val1 = driver.findElement(By.xpath("//*[@class='recordBasicInfo']"));
		if (val1.getText().contains("9876543210")) {
			System.out.println("Task Updated");
		}
	}

	@Test
	public void deleteTask() {
//		performClick(driver.findElement(By.xpath("//h4/span")));
		performClick(driver.findElement(By.xpath("//button[5]")));
		List<WebElement> del = driver.findElements(By.xpath("//div[2]/div/div[1]/ul/li/a"));
		del.get(0).click();
		performClick(driver.findElement(By.xpath("//*[text()='Yes']")));
		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val2 = driver.findElement(By.xpath("//*[text()='No records found']"));
		if (val2.getText().equals("No records found")) {
			System.out.println("Task Deleted");
		}
//		performClick(driver.findElement(By.xpath("//*[@id=\"overlayPage\"]/div[1]")));
		driver.navigate().refresh();
		performClick(driver.findElement(By.xpath("//*[@class='fa fa-user']")));
		performClick(driver.findElement(By.xpath("//*[text()='Sign Out']")));
		cleanUp();

	}
}
