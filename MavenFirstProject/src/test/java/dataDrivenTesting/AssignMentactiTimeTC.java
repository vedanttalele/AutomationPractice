package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility1;

public class AssignMentactiTimeTC extends SeleniumUtility1 {
	String appUrl;
	String userName;
	String password;
	String expectedTitle;
	String actualTitle;

	@BeforeTest
	public void getData() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3,
				1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3,
				2);
		expectedTitle = ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent",
				3, 3);
	}

	@Test
	public void actiTimeLogin() {
		WebDriver driver = setUp("chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.name("pwd")), password);
		clickOnElement(driver.findElement(By.id("loginButton")));
		actualTitle = getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3, 4,
					actualTitle);
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3, 5,
					"Passed");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 3, 5,
					"Failed");
		}
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void cleanUp1() {

		cleanUp();
	}
}