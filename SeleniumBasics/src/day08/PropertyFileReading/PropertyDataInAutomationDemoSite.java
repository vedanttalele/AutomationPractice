package day08.PropertyFileReading;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyDataInAutomationDemoSite {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(".\\TestData\\AutomationSiteData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.cssSelector("textarea[rows='3']")).sendKeys(prop.getProperty("address"));
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(prop.getProperty("emailId"));
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(prop.getProperty("phone"));
		List<WebElement> gender = driver.findElements(By.cssSelector(".form-group>div>label>input"));
		Thread.sleep(1000);
		gender.get(0).click();
//driver.findElement(By.cssSelector(".form-group>div>label>input[value]")).sendKeys(prop.getProperty("gender1"));
		List<WebElement> hobbies = driver.findElements(By.cssSelector("input[type='checkbox']"));
		hobbies.get(0).click();
		hobbies.get(1).click();
		driver.findElement(By.cssSelector("multi-select>.ui-widget")).click();
		List<WebElement> languages = driver.findElements(By.cssSelector("ul>li>a.ui-corner-all"));
//WebDriverWait wait = new WebDriverWait(driver, 20);
//wait.until(ExpectedConditions.elementToBeClickable(languages));
		Thread.sleep(1000);
		languages.get(7).click();
		Thread.sleep(1000);
		languages.get(15).click();
		driver.findElement(By.cssSelector("section div.row")).click();
//driver.findElement(By.cssSelector("div>div>select[id='Skills']")).click();
//List<WebElement> skills = driver.findElements(By.cssSelector("div>div>select.ng-valid-parse>option"));
		Thread.sleep(1000);
//skills.get(2).click();
		WebElement skills = driver.findElement(By.cssSelector("div>div>select[id='Skills']"));
		skills.click();
		Select selectSkill = new Select(skills);
		List<WebElement> skillsOptions = driver.findElements(By.cssSelector("div>div>select.ng-valid-parse>option"));
		selectSkill.selectByValue("Java");

		driver.findElement(By.cssSelector("div>span>span>span")).click();
		List<WebElement> selectCountry = driver.findElements(By.cssSelector("#select2-country-results > li"));
		Thread.sleep(1000);
		selectCountry.get(5).click();
		WebElement yearLabel = driver.findElement(By.cssSelector("#yearbox"));
		yearLabel.click();
		Select selectYear = new Select(yearLabel);
		List<WebElement> yearsOptions = driver.findElements(By.cssSelector("#yearbox>option"));
		selectYear.selectByValue("1999");
		WebElement monthLabel = driver.findElement(By.cssSelector("div:nth-child(3) > select"));
		monthLabel.click();
		Select selectmonth = new Select(monthLabel);
		List<WebElement> monthsOptions = driver.findElements(By.cssSelector("div:nth-child(3) > select>option"));
		selectmonth.selectByValue("November");
		WebElement dayLabel = driver.findElement(By.cssSelector("#daybox"));
		dayLabel.click();
		Select selectday = new Select(dayLabel);
		List<WebElement> daysOptions = driver.findElements(By.cssSelector("#daybox>option"));
		selectday.selectByValue("24");

		driver.findElement(By.cssSelector("#firstpassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys(prop.getProperty("confirmPassword"));
		driver.close();

	}
}