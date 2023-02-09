package testNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestngtActiTime extends SeleniumUtility {
	WebDriver driver;
	List<String> taskList;

	@Test
	public void createTask() throws InterruptedException {
		setUp("Chrome", "https://demo.actitime.com/login.do");
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")),"manager");
		performClick(driver.findElement(By.id("loginButton")));
		performClick(driver.findElement(By.id("container_tasks")));
		performClick(driver.findElement(By.cssSelector(".title.ellipsis")));
		performClick(driver.findElement(By.cssSelector(".createNewTasks")));
		List<WebElement> dropDown = driver.findElements(By.cssSelector(".customerOrProjectSelector  .selectedItem"));
		Thread.sleep(1000);
		performClick(dropDown.get(0));
		List<WebElement> companyNames = driver.findElements(By.cssSelector(
				"div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		performClick(companyNames.get(2));
		dropDown = driver.findElements(By.cssSelector(".customerOrProjectSelector  .selectedItem"));
		performClick(dropDown.get(1));
		List<WebElement> projectNames = driver.findElements(By.cssSelector(
				"div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		performClick(projectNames.get(4));
		typeInput(driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input")),"QA-Testing-Task");
		performClick(driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button")));
		Thread.sleep(1000);
		List<WebElement> checkTask = driver.findElements(By.cssSelector("td[class='names']>div>div>div>div.title"));
		taskList = new ArrayList<String>();
		for (int i = 0; i < checkTask.size(); i++) {
			taskList.add(checkTask.get(i).getText());
		}
		System.out.println("Task Names " + taskList);
		System.out.println("Validate :" + taskList.contains("QA-Testing-Task"));

	}

	@Test
	public void deleteTask() {
		performClick(driver.findElement(By.cssSelector(".createdTasksTableContainer tbody td.selection > div > div")));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='delete button']")));
		performClick(driver.findElement(By.cssSelector("div[class='delete button']")));
		System.out.println("Validate :" + taskList.contains("QA-Testing-Task"));
	    cleanUp();
	}
}
