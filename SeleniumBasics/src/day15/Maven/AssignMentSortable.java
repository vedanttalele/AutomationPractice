package day15.Maven;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day12.Utilities.SeleniumUtility;


public class AssignMentSortable {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://jqueryui.com/");

		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);

		List<WebElement> src = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement target = driver.findElement(By.xpath("//ul[@id='sortable']//li"));

		for (int i=src.size()-1;i>0; i--) {
			util.performDragAndDrop(src.get(i), target);
			util.setSleepTime(1000);
		}
		util.tearDown();

	}

}


/*
 * List<WebElement> src = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
 * for(int i=0;i<src.size()-1;i++){
 * util.performDragAndDrop(src.get(src.size()-1), src.get(i));
 * src=driver.driver.findElements(By.xpath("//ul[@id='sortable']//li"));
 * 
 * }
 */

/*
 * util.performDragAndDrop(src, target); util.setSleepTime(1000);
 *
 * Collection<WebElement> element
 * =driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
 * System.out.println(element.size());
 */