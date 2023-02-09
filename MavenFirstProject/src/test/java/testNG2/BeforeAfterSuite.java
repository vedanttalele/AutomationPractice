package testNG2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuite {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("*************Before Suite started******************");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("*************After Suite ended******************");
	}
}