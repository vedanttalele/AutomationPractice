package runTimeRetryfailedTc;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test002 {
	static int num=5;
	@Test
	public void Test3()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test4()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test5()
	{
		num--;
		Assert.assertTrue(num<4);
	}
}