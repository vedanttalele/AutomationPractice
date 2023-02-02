package day15.Maven;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentActitimeTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumBasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// type username as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		/* type password as manager */
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/* click on login button */
		driver.findElement(By.id("loginButton")).click();
		// Validate
//		String actualTitle = driver.getTitle();
//		String expectedTitle ="actiTIME - Enter Time-Track";
//		System.out.println("Validation :"+actualTitle.equals(expectedTitle));

		// Click on Task Tab
		driver.findElement(By.id("container_tasks")).click();
		// Click On AddNewButton
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		// Click on New Task Option
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		// Identify Project&CompanyDropDown
		List<WebElement> dropDown = driver.findElements(By.cssSelector(".customerOrProjectSelector  .selectedItem"));
		// Click on Company
		Thread.sleep(1000);
		dropDown.get(0).click();

		List<WebElement> companyNames = driver.findElements(By.cssSelector(
				"div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		companyNames.get(2).click();
		// click on project
		dropDown = driver.findElements(By.cssSelector(".customerOrProjectSelector  .selectedItem"));
		dropDown.get(1).click();
		List<WebElement> projectNames = driver.findElements(By.cssSelector(
				"div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		projectNames.get(4).click();
		driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input"))
				.sendKeys("QA-Testing-Task");
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button")).click();
		Thread.sleep(1000);
		List<WebElement> checkTask = driver.findElements(By.cssSelector("td[class='names']>div>div>div>div.title"));
		List<String> taskList = new ArrayList<String>();
		for (int i = 0; i < checkTask.size(); i++) {
			taskList.add(checkTask.get(i).getText());
		}
		System.out.println("Task Names " + taskList);
		System.out.println("Validate :" + taskList.contains("QA-Testing-Task"));
		
		driver.findElement(By.cssSelector(".createdTasksTableContainer tbody td.selection > div > div")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='delete button']")));
		driver.findElement(By.cssSelector("div[class='delete button']")).click();
		System.out.println("Validate :" + taskList.contains("QA-Testing-Task"));
		driver.close();
	}
}
//#createTasksPopup_content > div.scrollableContainer > div.contentWrapper > div > div.customerProjectSelectorPlaceholder > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div > div.scrollableDropdownView > div > div.contentWrapper > div > div.itemRow.selected
//#createTasksPopup_content > div.scrollableContainer > div.contentWrapper > div > div.customerProjectSelectorPlaceholder > div > table > tbody > tr.selectProjectRow.projectSelectorRow > td:nth-child(1) > div > div > div.scrollableDropdownView > div > div.contentWrapper > div > div.itemRow.selected
