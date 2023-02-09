package retryfailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	static int num=5;
	@Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	@Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class)
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}	
	@Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class)
	public void Test3()
	{
		num--;
		Assert.assertTrue(num<4);
	}
}