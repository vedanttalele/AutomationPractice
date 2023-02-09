package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility1;

public class AssignMentactiTimeTC2 extends SeleniumUtility1{
	String appUrl;
	String userName;
	String password;
	String expectedTitle;
	String actualTitle;
	
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 2);
		expectedTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 3);
	}

	@Test
	public void actiTimeLogin() {
		    WebDriver driver=setUp("chrome", appUrl);	
		    typeInput(driver.findElement(By.id("username")), userName);
			typeInput(driver.findElement(By.name("pwd")), password);
			clickOnElement(driver.findElement(By.id("loginButton")));
			actualTitle=getCurrentTitleOfApplication("actiTIME - Login");
			System.out.println(actualTitle);
			if(actualTitle.equals(expectedTitle)) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 4,actualTitle);
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 5,"Passed");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\excelfiles\\AppTest.xlsx", "TC AssignMent", 4, 5,"Failed");
			}
			Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void cleanUp1() {
		
		cleanUp();
	}
}