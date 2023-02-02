package day13.SS_and_JSE;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import day12.Utilities.SeleniumUtility;


public class GetScreenShot2 {
	
	public static void main(String[] args) throws IOException {
		SeleniumUtility m1=new SeleniumUtility();	
		WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		//type cast WebDriver instance into TakesScreenshot interface
		String fileLocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";
		m1.takeScreenshot(fileLocation);
	}

}