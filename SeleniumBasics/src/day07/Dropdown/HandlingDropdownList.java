package day07.Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {
//  Try & Trial
	public static void main(String[] args){

		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		// **** Identify dropdown list
		WebElement monthDropdown = driver.findElement(By.cssSelector("div:nth-child(3) > select"));

		// **** Create an instance of Select class and pass above element into its
		// constructor
		Select selectMonth = new Select(monthDropdown);

		// **** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: " + selectMonth.isMultiple());

		// **** get default or already select option
//		WebElement selectedOption=selectMonth.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
		// or
		System.out.println("Already selected option name: " + selectMonth.getFirstSelectedOption().getText());

		// get option count
		List<WebElement> monthOptions = selectMonth.getOptions();
		System.out.println("Option count is:" + monthOptions.size());
		// Get dropdown option names
		for (int i = 1; i < monthOptions.size(); i++) {
			System.out.println("Option " + i + ": " + monthOptions.get(i).getText());
		}

		// TODO: validation dropdown skills are getting displayed in ascending order

		// select options from dropdown
//		selectMonth.selectByIndex(4);
//		System.out.println("Already selected option name: " + selectMonth.getFirstSelectedOption().getText());
//		// or
//		selectMonth.selectByValue("Backup Management");
//		System.out.println("Already selected option name: " + selectMonth.getFirstSelectedOption().getText());
//		// or
//		selectMonth.selectByVisibleText("Analytics");
//		System.out.println("Already selected option name: " + selectMonth.getFirstSelectedOption().getText());

		// Checking the order of skills
		String act_monthName = "";
		// Get dropdown option names
		for (int i = 1; i < monthOptions.size(); i++) {
			if ((monthOptions.size() - 1) != i) {
				act_monthName = act_monthName + monthOptions.get(i).getText() + ", ";
			} else {
				act_monthName = act_monthName + monthOptions.get(i).getText();
			}
			System.out.println(act_monthName);
		}
		System.out.println(act_monthName);
	
		
		
		
		// Expected skills
		String exp_monthName = "Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
//		System.out.println("skillName: " + act_monthName);
		System.out.println("exp_skillName: " + exp_monthName);
		System.out.println("Skills are in sorted order or not: " + act_monthName.equals(exp_monthName));

		
		// TODO: perform validation on following
		// 1. Year(ascending order validation)
		Select yearDrop = new Select(driver.findElement(By.id("yearbox")));
		List<Integer> years = new ArrayList<Integer>();
		for (int i = 1; i < yearDrop.getOptions().size(); i++) {
			String year = yearDrop.getOptions().get(i).getText();
			years.add(Integer.parseInt(year));
		}
		List<Integer> dupYears = new ArrayList<Integer>();
		dupYears.addAll(years);
		Collections.sort(dupYears);
		System.out.println("Years Are Sorted or Not: "+years.equals(dupYears));
		
		
		// 2. Month(month Sequence validation)
	  
	    
	//	driver.findElement(By.className("ng-invalid-required ng-touched")).click();
//		System.out.println("Already selected option name: " + monthDropdown.getFirstSelectedOption().getText());
//		List<WebElement> monthOptions = ((Select) monthDropDown).getOptions();
//		System.out.println("Option count is:" + monthOptions.size());
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println("Option " + i + ": " + monthOptions.get(i).getText());
//		}
		
//		for (int i = 1; i < monthDrop.getOptions().size(); i++) {
//			String months = monthDrop.getOptions().get(i).getText();
//			System.out.println("months"+months);
//		}
		
//		List<Integer> dupM = new ArrayList<Integer>();
//		dupYears.addAll(years);
//			
		
		// 3. Days(ascending order validation)
		Select dayDrop = new Select(driver.findElement(By.id("daybox")));
		List<Integer> days = new ArrayList<Integer>();
		for (int i = 1; i < dayDrop.getOptions().size(); i++) {
			String day = dayDrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));
		}
		List<Integer> dupDays = new ArrayList<Integer>(days);
		// dupDays.addAll(days);
		Collections.sort(dupDays);
		System.out.println(days);
		System.out.println("Days are sorted or not: "+days.equals(dupDays));
	}
}