package day15.Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day12.Utilities.SeleniumUtility;


public class AssignMentVtigerTask {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility util = new SeleniumUtility();
		driver = util.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		util.performClick(driver.findElement(By.className("buttonBlue")));
		util.performClick(driver.findElement(By.xpath("//*[@id='appnavigator']/div")));
		util.performClick(driver.findElement(By.xpath("//*[text()=' MARKETING']")));
		util.performClick(driver.findElement(By.cssSelector(" div:nth-of-type(2)>ul>div>div>li:nth-of-type(2)>a")));
		util.performClick(driver.findElement(By.xpath("//*[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")));
		util.performClick(driver.findElement(By.xpath("//*[@id='s2id_autogen1']")));
		List<WebElement> autogen = driver.findElements(By.xpath("//*[@id='select2-results-2']/li"));
		autogen.get(1).click();
		driver.findElement(By.xpath("//*[@id='Leads_editView_fieldName_firstname']")).sendKeys("Automation", Keys.TAB,
				"Testing");
		util.performClick(driver.findElement(By.xpath("//*[text()='Save']")));
//		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val = driver.findElement(By.xpath("//h4/span"));
		if (val.getText().contains("Automation Testing")) {
			System.out.println("Task Created");
		}

//		modify
//		util.performClick(driver.findElement(By.xpath("//h4/span")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Edit']")));
		driver.findElement(By.xpath("//*[@id='Leads_editView_fieldName_phone']")).sendKeys("9876543210");
		util.performClick(driver.findElement(By.xpath("//*[text()='Save']")));
//		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val1 = driver.findElement(By.xpath("//*[@class='recordBasicInfo']"));
		if (val1.getText().contains("9876543210")) {
			System.out.println("Task Updated");
		}

//		delete
//		util.performClick(driver.findElement(By.xpath("//h4/span")));
		util.performClick(driver.findElement(By.xpath("//button[5]")));
		List<WebElement> del = driver.findElements(By.xpath("//div[2]/div/div[1]/ul/li/a"));
		del.get(0).click();
		util.performClick(driver.findElement(By.xpath("//*[text()='Yes']")));
		driver.findElement(By.xpath("//*[@class='keyword-input']")).sendKeys("Automation", Keys.ENTER);
		WebElement val2 = driver.findElement(By.xpath("//*[text()='No records found']"));
		if (val2.getText().equals("No records found")) {
			System.out.println("Task Deleted");
		}
//		util.performClick(driver.findElement(By.xpath("//*[@id=\"overlayPage\"]/div[1]")));
		driver.navigate().refresh();
		util.performClick(driver.findElement(By.xpath("//*[@class='fa fa-user']")));
		util.performClick(driver.findElement(By.xpath("//*[text()='Sign Out']")));
		util.cleanUp();

	}

}
//util.performClick(driver.findElement(By.xpath("//*[text()=' Leads ']")));
//util.performClick(driver.findElement(By.xpath("//*[@class='listViewEntriesCheckBox']")));
//util.performClick(driver.findElement(By.xpath("//*[@id='Leads_listView_massAction_LBL_DELETE']")));
//util.performClick(driver.findElement(By.xpath("//*[text()='Yes']")));
