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

public class HandlingDropDownList1 {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				driver.get("http://demo.automationtesting.in/Register.html");
				WebElement skillDropdown = driver.findElement(By.id("Skills"));

				Select selectSkill = new Select(skillDropdown);

				System.out.println("Is dropdown is allowing you to select multiple option: " + selectSkill.isMultiple());

				// **** get default or already select option
//				WebElement selectedOption=selectSkill.getFirstSelectedOption();
//				String selectedOptionName=selectedOption.getText();
//				System.out.println("Already selected option name: "+selectedOptionName);
				// or
				System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

				List<WebElement> options = selectSkill.getOptions();
				System.out.println("Option count is:" + options.size());
				for (int i = 0; i < options.size(); i++) {
					System.out.println("Option " + i + ": " + options.get(i).getText());
				}


				// select options from dropdown
				selectSkill.selectByIndex(4);
				System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
				// or
				selectSkill.selectByValue("Backup Management");
				System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
				// or
				selectSkill.selectByVisibleText("Analytics");
				System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

				//Checking the order of skills
				String act_skillName="";
				for (int i = 1; i < options.size(); i++) {
					if((options.size()-1)!=i) {
						act_skillName=act_skillName+options.get(i).getText()+", ";
					}else {
						act_skillName=act_skillName+options.get(i).getText();
					}
				}
				//Expected skills
				String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
				System.out.println("skillName: "+act_skillName);
				System.out.println("exp_skillName: "+exp_skillName);
				System.out.println("Skills are in sorted order or not: "+act_skillName.equals(exp_skillName));

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
				WebElement monthDropdown = driver.findElement(By.cssSelector("div:nth-child(3) > select"));
				Select selectMonth = new Select(monthDropdown);
				System.out.println("Is dropdown is allowing you to select multiple option: " + selectMonth.isMultiple());
				System.out.println("Already selected option name: " + selectMonth.getFirstSelectedOption().getText());
				List<WebElement> monthOptions = selectMonth.getOptions();
				System.out.println("Option count is:" + monthOptions.size());
				// Get dropdown option names
				for (int i = 1; i < monthOptions.size(); i++) {
					System.out.println("Month " + i + ": " + monthOptions.get(i).getText());
				}
				String act_monthName = "";
				for (int i = 1; i < monthOptions.size(); i++) {
					if ((monthOptions.size() - 1) != i) {
						act_monthName = act_monthName + monthOptions.get(i).getText() + ", ";
					} else {
						act_monthName = act_monthName + monthOptions.get(i).getText();
					}
//					System.out.println(act_monthName);
				}
				System.out.println(act_monthName);
				// Expected skills
				String exp_monthName = "January, February, March, April, May, June, July, August, September, October, November, December";
						
//				System.out.println("skillName: " + act_monthName);
				System.out.println("exp_monthName: " + exp_monthName);
				System.out.println("Months are in sequential order or not: " + act_monthName.equals(exp_monthName));


				
				
				// 3. Days(ascending order validation)
				
				Select dayDrop=new Select(driver.findElement(By.id("daybox")));
				List<Integer> days=new ArrayList<Integer>();
				for(int i=1;i<dayDrop.getOptions().size();i++) {
					String day=dayDrop.getOptions().get(i).getText();
					days.add(Integer.parseInt(day));
				}
				List<Integer> dupDays=new ArrayList<Integer>(days);
				//dupDays.addAll(days);
				Collections.sort(dupDays);
				System.out.println("Days Are Sorted or Not: "+days.equals(dupDays));
	}

}
