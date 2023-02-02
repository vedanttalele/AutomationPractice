package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class TaskCreation {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		//click on Task tab
		driver.findElement(By.id("container_tasks")).click();
		//click on Add New button
		driver.findElement(By.cssSelector(".addNewButton")).click();
		//clikc on New Tasks link
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		//wait for Task page to load completely
		Thread.sleep(3000);
		//Identify on Company & project Dropdown
		List<WebElement> dropdowns=driver.findElements(By.cssSelector(".customerOrProjectSelector .selectedItem"));
		//click on company dropdown
		dropdowns.get(0).click();
		//get company list
		List<WebElement> companyNames=driver.findElements(By.cssSelector("div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		companyNames.get(2).click();
		//click on project dropdown
		dropdowns=driver.findElements(By.cssSelector(".customerOrProjectSelector .selectedItem"));
		dropdowns.get(1).click();
		//get project list
		List<WebElement> projectNames=driver.findElements(By.cssSelector("div[class='scrollableDropdownView'][style*='display: block'] div[class='searchItemList']>div"));
		projectNames.get(3).click();
		//enter task name
		driver.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child>input")).sendKeys("QA-Testing-Task");
		//click on create task button
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
		//wait for Task page to load completely
		Thread.sleep(3000);
		//get all task name from task page
		List<WebElement> taskList=driver.findElements(By.cssSelector(".tasksTableVerticalScrollContainer .title"));
		//To store all the task name creating new ArrayList
		List<String> actualTaskName=new ArrayList<String>();
		for(int i=0;i<taskList.size();i++) {
			actualTaskName.add(taskList.get(i).getText());
		}
		System.out.println("Actuatal Task list: "+actualTaskName);
		//validation newly created task
		System.out.println(actualTaskName.contains("QA-Testing-Task"));
		
	}
	
}
